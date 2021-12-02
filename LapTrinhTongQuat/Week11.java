import java.util.Collections;
import java.util.List;

public class Week11<T>  {
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        Collections.sort(arr);
        return arr;
    }
}
