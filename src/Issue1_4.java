/**
 * Напишите функцию, которая проверяет является заданная строка перестановкой палиндрома.
 */
public class Issue1_4 {
    public static void main(String[] args) {
        solution("taco cat", "atco cta");
    }

    private static void solution(String str1, String str2) {
        int resultSum = 0;
        boolean result = false;

        if (str1.length() == str2.length()) {
            char[] str1Chars = str1.toCharArray();
            int str1Sum = 0;
            char[] str2Chars = str2.toCharArray();
            int str2Sum = 0;

            for (char c : str1Chars) str1Sum += c;
            for (char c : str2Chars) str2Sum += c;

            if (str1Sum == str2Sum) {
                int strLength = str1.length();
                for (int i = 0; i < strLength / 2; i++) {
                    int j = strLength - i - 1;
                    boolean isPolyndom = str2Chars[i] == str2Chars[j];
                    if (isPolyndom) resultSum++;
                }
            }
        }

        if ((str2.length()/2 - 1) - resultSum == 0) result = true;

        System.out.println(str1 + " - " + str2 + " : " + result);
    }
}
