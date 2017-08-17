import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Реализуйте метод простейшего сжатия строк с использованием счётчика повторяющихся символов.
 * Например, aabcccccaaa превращается в a2b1c5a3. Если сжатая строка не становится короче исходной, то метод
 * возвращает исходную строку. Предполагается, что строка состоит только из букв ерхнего и нижнего регистра(a-z).
 */
public class Issue1_6 {
    public static void main(String[] args) {
        solution("aabcccccaaa");
    }

    private static void solution(String str) {
        System.out.print(str + " : ");

        ArrayList<HashMap<Character, Integer>> compressedCharContainer = new ArrayList<>();

        char headChar = 0;
        int index = 1;
        int indexOfEnd = 1;
        for (char currentChar : str.toCharArray()) {
            if (headChar == 0) {
                headChar = currentChar;
                continue;
            }
            if (headChar == currentChar) index++;
            if (headChar != currentChar) {
                HashMap compressedChar = new HashMap();
                compressedChar.put(headChar, index);
                compressedCharContainer.add(compressedChar);
                headChar = currentChar;
                index = 1;
            }
            if (++indexOfEnd == str.length() - 1) {
                HashMap compressedChar = new HashMap();
                index++;
                compressedChar.put(headChar, index);
                compressedCharContainer.add(compressedChar);
                index = 1;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (HashMap compressedChar : compressedCharContainer) {
            Set<Map.Entry> compressedCharEntry = compressedChar.entrySet();
            stringBuilder.append(compressedCharEntry.iterator().next().getKey());
            stringBuilder.append(compressedCharEntry.iterator().next().getValue());
        }


        if (stringBuilder.length() > str.length()) System.out.println(str);
        else System.out.println(stringBuilder);
    }
}
