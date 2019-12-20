import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    /**
     * Returns elements for the list of Strings that
     * have certain length
     * <p>
     * Method is executed in {@link #main(String[])}
     *
     * @param len  - maximum length of String element
     * @param list - List of values
     * @return list of elements, that have length
     * less than len
     */
    public static List getListElementsUnder(int len,
                                            List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() < len) result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> arrayListStr = new
                ArrayList<>();
        arrayListStr.add("Hello");
        arrayListStr.add("Student");

        List<String> result = getListElementsUnder(6, arrayListStr);
        System.out.println(result);
        List<String> linkedListStr = new
                LinkedList<>();
        linkedListStr.add("Math");
        linkedListStr.add("IT");
        linkedListStr.add("Physics");
        linkedListStr.add("PE");
        List<String> res =
                getListElementsUnder(6, linkedListStr);
        System.out.println(res);
    }
}