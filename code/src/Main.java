import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // var f = (int x) -> x + 1;
        Function<Integer, Integer> f =
                (Integer x) -> {
                    // yield
                     return
                             x + 1;
                };

        Number[] a = new Integer[5];
        a[0] = 1.23;
    }

    <A> Optional<Integer> elementIndex(List<A> list, A element) {
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i).equals(element))
                return Optional.of(i);
        }
        return Optional.empty();
    }

    /*
    public <T> T sum(ArrayList<T> list) {
        if (T.class == Integer.class) {
            int result = 0;
            // ...
            return new result;
        } else if (T.class == Float.class) {
            float result = 0;
            // ...
            return result;
        }
    }
     */

    static public Function<Integer, Integer> makeInc(int n) {
        // ++n;
        return (Integer i) -> i + n;
    }


}