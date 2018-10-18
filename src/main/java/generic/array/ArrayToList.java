package generic.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    static <T> List<T> arrayToList(final T[] array) {
        final List<T> arrayList = new ArrayList<T>(array.length);

        for (final T s : array) {
            arrayList.add(s);
        }
        return (arrayList);
    }
}
