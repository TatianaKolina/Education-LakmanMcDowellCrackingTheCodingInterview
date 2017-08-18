import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Массивы и строки
 */
public class Issue1_0 {
    public static void main(String[] args) {
    }

    /**
     * Кастомная реализация HashTable.
     */
    static class MyHashTable<K, V> {
        int SIZE = 10;
        LinkedList<Entry>[] entries = new LinkedList[SIZE];

        public void put(K key, V value) {
            Entry<K, V> entry = new Entry();
            entry.setKey(key);
            entry.setValue(value);
            int index = getIndex(entry.getKey());

            if (entries[index] == null) entries[index] = new LinkedList<>();
            entries[index].add(entry);
        }

        public V get(K key) {
            int index = getIndex(key);

            if (entries[index] == null) throw new RuntimeException("No such element");
            if (entries[index].size() == 0) throw new RuntimeException("No such element");
            if (entries[index].size() == 1) return (V) entries[index].get(0).getValue();
            if (entries[index].size() > 1) {
                for (Entry e : entries[index]) {
                    if (e.getKey().equals(key)) {
                        return (V) e.getValue();
                    }
                }
            }

            return null;
        }

        public int getIndex(K key) {
            int index = key.hashCode() / SIZE;

            return index;
        }

        static class Entry<K, V> {
            K key;
            V value;

            public K getKey() {
                return key;
            }

            public void setKey(K key) {
                this.key = key;
            }

            public V getValue() {
                return value;
            }

            public void setValue(V value) {
                this.value = value;
            }
        }
    }


    /**
     * Кастомная реализация ArrayList.
     */
    static class MyArrayList<T extends Object> {
        private T[] items = (T[]) new Object[10];
        private int index = 0;

        public void add(T item) {
            if (index == items.length - 1) {
                T[] newItems = (T[]) new Object[items.length * 2];

                int indx = 0;
                for (T el : items) {
                    newItems[indx] = el;
                }

                items = newItems;
            }

            items[index] = item;
            index++;
        }

        public T get(int i) {
            return items[i];
        }
    }

    /**
     * Кастомная реализация StringBuilder.
     */
    static class MyStringBuilder {
        private int totalCharsLength = 0;
        private ArrayList<char[]> stringChars = new ArrayList<>();

        public void append(String string) {
            stringChars.add(string.toCharArray());
            totalCharsLength += string.length();
        }

        @Override
        public String toString() {
            char[] chars = new char[totalCharsLength];

            int charsIndex = 0;
            for (char[] achars : stringChars) {
                for (char c : achars) {
                    if (charsIndex < totalCharsLength) {
                        chars[charsIndex] = c;
                        charsIndex++;
                    }
                }
            }

            return new String(chars);
        }
    }
}
