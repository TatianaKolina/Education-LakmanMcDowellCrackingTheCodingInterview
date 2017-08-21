import java.util.LinkedList;

/**
 * Реализуйте алгоритм для нахождения в односвязном списке k-го элемента с конца.
 */
public class Issue2_2 {
    public static void main(String[] args) {
        solution();
    }

    /**
     * Если размер списка нам ещё не известен.
     */
    private static void solution() {
        LinkedList linkedList = new LinkedList() {{
            add("0"); add("1"); add("2"); add("3"); add("4"); add("5"); add("6"); add("7"); add("8"); add("9");
        }};
        int last_index = 0;
        int k = 3;

        for (Object item : linkedList) {
            last_index++;
        }

        System.out.println(linkedList.get(linkedList.size() - k - 1));
    }
}
