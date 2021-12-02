import java.util.List;

public class ShapeUtil {
    /**
     * Print Info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder result = new StringBuilder("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                result.append(shape.getInfo()).append("\n");
            }
        }
        result.append("Triangle:");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                result.append("\n").append(shape.getInfo());
            }
        }
        String res = result.toString();
        return res;
    }
}
