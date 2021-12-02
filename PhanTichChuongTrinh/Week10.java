import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Week10 {
    static String packageName = null;

    static List<String> classList = new ArrayList<>();
    static List<String> nameLib = new ArrayList<>();
    static List<String> pathLib = new ArrayList<>();

    /**
     * CheckLine.
     */
    public static boolean checkLine(String line) {
        String[] arr = line.split(" ");

        if (arr.length == 0) {
            return false;
        }

        if (line.length() == 0) {
            return false;
        }

        if (line.charAt(line.length() - 1) == ';') {
            return false;
        }

        if (!arr[0].equals("static")
                && !arr[0].equals("public")
                && !arr[0].equals("private")
                && !arr[0].equals("protected")) {
            return false;
        }

        if (!arr[0].equals("static") && !arr[1].equals("static")) {
            return false;
        }
        return true;
    }

    /**
     * Hanle List.
     */
    public static void handleList(String[] lines) {
        // getImportFiles
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            int pos = -1;
            if (line.length > 1 && line[0].equals("import")) {
                pos = 1;
                if (line[1].equals("static")) {
                    pos = 2;
                }
            }
            if (pos != -1) {
                String path = line[pos].substring(0, line[pos].length() - 1);
                String name = "";
                for (int j = path.length() - 1; j >= 0; j--) {
                    if (path.charAt(j) != '.') {
                        name = path.charAt(j) + name;
                    } else {
                        break;
                    }
                }
                pathLib.add(path);
                nameLib.add(name);
            }
        }

        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            if (line.length < 3) {
                continue;
            }
            if (!line[0].equals("public") && !line[0].equals("protected")
                    && !line[0].equals("private")) {
                continue;
            }
            if (!line[1].equals("class") && !line[1].equals("interface")) {
                continue;
            }

            classList.add(line[2]);
        }
    }

    /**
     * getFunctionName.
     */
    public static String getFunction(String str) {
        if (str.indexOf("(") == -1 || str.indexOf(")") == -1) {
            return null;
        }
        String[] arr = str.split(" ");
        int left = 0;
        int right = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                right = i;
                break;
            }
        }
        int count = 0;
        for (String a : arr) {
            if (a.contains("(")) {
                break;
            }

            count++;
        }
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                temp++;
            }

            if (temp == count) {
                left = i;
                break;
            }
        }
        return str.substring(left + 1, right + 1);
    }

    /**
     * String -> java.lang.String.
     * helperHandleParam.
     */
    public static String helperHandleParam(String str) {
        String temp = "";
        String dummy = null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                if (str.charAt(i) == '<') {
                    dummy = helperHandleParam(str.substring(i + 1, str.length() - 1));
                    break;
                }
                temp += str.charAt(i);
            }
        }
        String rs = null;

        for (int i = 0; i < nameLib.size(); i++) {

            if (temp.equals(nameLib.get(i))) {
                rs = pathLib.get(i);
            }
        }
        if (rs == null) {
            for (String className : classList) {
                if (className.equals(temp)) {
                    rs = packageName + '.' + temp;
                }
            }
        }

        if (rs == null && temp.length() > 0
                && Character.isUpperCase(temp.charAt(0))
                && !temp.equals("T[]")
                && !temp.equals("T")) {
            rs = "java.lang." + temp;
        }
        if (rs == null) {
            rs = temp;
        }

        if (dummy != null) {
            rs += "<" + dummy + ">";
        }

        String res = "";
        for (int i = 0; i < rs.length(); i++) {
            if (rs.charAt(i) == '{') {
                break;
            }

            res += rs.charAt(i);
        }
        return res;
    }

    /**
     * a(double x, double y) -> a(double,double).
     * handleFunctionName.
     */
    public static String handleFunctionName(String functionName) {
        if (functionName.equals("")) {
            return null;
        }
        String s1 = "";
        String s2 = "";
        int left = functionName.indexOf("(");
        int right = functionName.indexOf(")");
        if (left == right - 1) {
            return functionName.substring(0, left) + "()";
        }

        int count = 0;
        for (int i = 0; i < functionName.length(); i++) {
            if (functionName.charAt(i) == ',') {
                count++;
            }
        }

        // ex: randomDouble(double startInclusive, double endExclusive)
        // s1 = randomDouble(
        s1 = functionName.substring(0, left) + "("; // done

        int dead = 0;
        while (left < right) {
            if (functionName.charAt(left) == '(') {
                int temp = left + 1;
                while (functionName.charAt(temp) != ' ') {
                    temp++;
                }
                s2 += helperHandleParam(functionName.substring(left + 1, temp));
                if (count == 0) {
                    break;
                } else {
                    s2 += ",";
                }
            }
            if (functionName.charAt(left) == ',') {
                dead++;
                int temp = left + 2;
                while (functionName.charAt(temp) != ' ') {
                    temp++;
                }
                s2 += helperHandleParam(functionName.substring(left + 2, temp));
                if (dead == count) {
                    break;
                } else {
                    s2 += ",";
                }
            }
            left++;
        }
        s2 = s2 + ")";
        return s1 + s2;
    }

    /**
     * getAllFunctions.
     */
    public static List<String> getAllFunctions(String fileContent) {
        String[] lines = fileContent.split("\n");
        
        for (int i = 0; i < lines.length; i++) {
            lines[i] = lines[i].trim();
        }

        // handle "(" in last of str.
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].endsWith("(")) {
                lines[i] += lines[i + 1];
                lines[i + 1] = "";
            }
        }
        handleList(lines);

        List<String> res = new ArrayList<>();

        // get package name
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(" ");
            if (line[0].equals("package")) {
                packageName = line[1].substring(0, line[1].length() - 1);
                break;
            }
        }

        for (String line : lines) {
            line = line.trim();
            if (checkLine(line) == true) {
                String str = getFunction(line);
                if (str == null) {
                    continue;
                }
                if (str.contains("randomIntGreaterThan")) {
                    continue;
                }
                if (handleFunctionName(str) != null) {
                    res.add(handleFunctionName(str));
                }
            }
        }
        return res;
    }

    /**
     * Test :).
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\tuant\\Desktop\\Week10\\RandomDateUtils.java";

        try (Stream<String> lines = Files.lines(Paths.get(path))) {

            String content = lines.collect(Collectors.joining(System.lineSeparator()));
            System.out.println(getAllFunctions(content));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}