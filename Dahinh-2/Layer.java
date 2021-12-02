import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.LinkedHashSet;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeCircles() {
        ListIterator<Shape> itr = shapes.listIterator();
        while (itr.hasNext()) {
            Shape shape = itr.next();
            if (shape instanceof Circle) {
                itr.remove();
            }
        }
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Layer of crazy shapes:");
        sb.append("\n");
        for (Shape shape : shapes) {
            sb.append(shape.toString());
            sb.append("\n");
        }
        String result = sb.toString();
        return result;
    }

    public void removeDuplicates() {
        this.shapes = new ArrayList<Shape>(new LinkedHashSet<Shape>(shapes));
    }
}
