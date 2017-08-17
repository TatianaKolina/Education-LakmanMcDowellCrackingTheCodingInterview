/**
 * Допустим, что существует метод isSubstring, проверяющий, является ли одно слово подстрокой другого.
 * Для двух строк s1 и s2 напишите код, который проверяет, получена ли строка s2 циклическим сдвигом s1, используя
 * только один вызов метода isSubstring(пример: слово watterbottle получено циклическим сдвигом erbottlewat).
 */
public class Issue1_9 {
    public static void main(String[] args) {
        resolution("watterbottle", "erbottlewat");
    }

    private static void resolution(String str1, String str2) {
        System.out.print(str1 + " - " + str2 + " : ");

        boolean result = false;

        if (str1.length() != str2.length()) result = false;
        if (charsSum(str1.toCharArray()) == charsSum(str2.toCharArray())) result = false;
        if (str1.contains(str2.substring(0, str2.length() / 2))) result = true;

        System.out.println(result);
    }

    private static int charsSum(char[] chars) {
        int sum = 0;
        for (char c : chars) sum += c;

        return sum;
    }
}
