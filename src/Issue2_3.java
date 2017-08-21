/**
 * Реализуйте алгоритм удаляющий узел из середины односвязного списка (т.е. узла не являющегося ни начальным, ни конечным
 */

//TODO Завершить
public class Issue2_3 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        OneLinkedList oneLinkedList = new OneLinkedList() {{
            add("1");
            add("2");
            add("3");
            add("4");
            add("5");
            add("6");
            add("7");
        }};

        oneLinkedList.removeFromMiddle();
    }

    static class OneLinkedList<T> {
        OneLinkedList next = null;
        T data = null;
        int size = 0;

        public OneLinkedList() {
        }

        public OneLinkedList(Object data) {
            this.data = (T) data;
        }

        public void add(T data) {
            OneLinkedList currentLinkedList = this;
            while (currentLinkedList.next != null) {
                currentLinkedList = currentLinkedList.next;
            }
            currentLinkedList.next = new OneLinkedList(data);

            size++;
        }

        public void removeFromMiddle() {
            OneLinkedList currentNode = this;

            System.out.println("___");
            for (int i = 0; i < size; i++) {
                System.out.println("" + i + " : " + currentNode.data);
                currentNode = currentNode.next;
            }
            currentNode = this;
            System.out.println("___");


            if (size > 1) {
                for (int i = Math.round(size / 2); i > 0; i--) {
                    currentNode = currentNode.next;
                }
                currentNode.next = currentNode.next.next;
                size--;
            }
            currentNode = this;

            System.out.println("___");
            for (int i = 0; i < size; i++) {
                System.out.println("" + i + " : " + currentNode.data);
                currentNode = currentNode.next;
            }
            currentNode = this;
            System.out.println("___");
        }
    }
}
