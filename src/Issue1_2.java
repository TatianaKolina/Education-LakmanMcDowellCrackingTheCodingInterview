/**
 * Для двух строк напишите метод, определяющий, является ли строка перестановкой другого
 */
public class Issue1_2 {
    public static void main(String[] args) {
        solution("_str1", "str1_");
        solution("_str1", "str1__");
    }

    /**
     * Сумма символов является перестановкой, значить длина этих строк и сумма кодов символов этих строй должна быть эквивалентна
     */
    public static void solution(String str1, String str2) {
        System.out.print(str1 + ", " + str2 + ": ");

        boolean result = false;
        char[] str1Chars = str1.toCharArray();
        int str1Sum = 0;
        char[] str2Chars = str2.toCharArray();
        int str2Sum = 0;

        if (str1.length() == str2.length()) {
            for (char c : str1Chars) str1Sum += c;
            for (char c : str2Chars) str2Sum += c;
            result = str1Sum == str2Sum;
        }

        System.out.println(result);
    }
}
