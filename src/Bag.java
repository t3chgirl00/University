import java.util.ArrayList;
import java.util.List;

public class Bag <T>{
    List<T> object = new ArrayList<>();

    public void add(T o) {
        object.add(o);
    }

    public void remove(T o) {
        object.remove(o);
    }

    public void clear(T o) {
        object.clear();

    }
}
