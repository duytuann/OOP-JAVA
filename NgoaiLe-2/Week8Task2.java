import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    /**
     * nullPointerEx.
     */
    public int nullPointerEx() throws NullPointerException {
            String str = null;
            return str.length();
    }

    /**
     * nullPointerExTest.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return ("Không có lỗi");
        } catch (NullPointerException e) {
            return ("Lỗi Null Pointer");
        }
    }

    /**
     * arrayIndexOutOfBoundsEx.
     */
    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
            int[] array = {7};
            System.out.println(array [1]);
    }

    /**
     * arrayIndexOutOfBoundsExTest.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return ("Không có lỗi");
        } catch (ArrayIndexOutOfBoundsException e) {
            return ("Lỗi Array Index Out of Bounds");
        }
    }

    /**
     * ArithmeticEx.
     */
    public void arithmeticEx() throws ArithmeticException {
        int dev = 1 / 0;
    }

    /**
     * arithmeticExTest.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return ("Không có lỗi");
        } catch (ArithmeticException e) {
            return ("Lỗi Arithmetic");
        }
    }

    /**
     * fileNotFoundEx.
     */
    public void fileNotFoundEx() throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
    }

    /**
     * fileNotFoundExTest.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return ("Không có lỗi");
        } catch (FileNotFoundException e) {
            return ("Lỗi File Not Found");
        }
    }

    /**
     * ioEx.
     */
    public void ioEx() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    }

    /**
     * ioExTest.
     */
    public String ioExTest() {
        try {
            ioEx();
            return ("Không có lỗi");
        } catch (IOException e) {
            return ("Lỗi IO");
        }
    }
}

