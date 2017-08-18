import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Напишите код для удаления дубликатов из несортированного связанного списка.
 * Дополнительно, попробуйте решить данную задачу без использования дополнительного буфера.
 */
public class Issue2_1 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("Test");
        linkedList.add("Test");
        linkedList.add("test1");
        linkedList.add("test2");
        linkedList.add("test1");
        linkedList = new LinkedList(new HashSet(Arrays.asList(linkedList.toArray())));

        System.out.println(linkedList);
    }
}
