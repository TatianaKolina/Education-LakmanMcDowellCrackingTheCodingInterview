/**
 * Существует три вида модифицирующих операции со строками: вставка символа, удаление символа, замена символа.
 * Напишите функцию, которая проверяет, находятся ли две строки на расстоянии одной модификации (или нуля модицикации).
 * Пример,
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
public class Issue1_5 {
    public static void main(String[] args) {
        solution("pale", "bake");
    }

    private static void solution(String str1, String str2) {
        boolean result = false;

        if (str1.equals(str2)) result = true;
        else {
            int str1CharsSum = charsSum(str1.toCharArray());
            int str2CharsSum = charsSum(str2.toCharArray());

            for (char c : str1.toCharArray()) {
                if (str1CharsSum - c == str2CharsSum) result = true;
            }

            if (!result) {
                byte isEq = 0;
                byte isNeq = 0;
                char[] str1Chars = str1.toCharArray();
                char[] str2Chars = str2.toCharArray();
                for (int i = 0; i < str1Chars.length; i++) {
                    if (str1Chars[i] == str2Chars[i]) isEq++;
                    else isNeq++;
                }

                if (isEq + isNeq == str1Chars.length && isNeq == 1) {
                    result = false;
                }
            }
        }

        System.out.println(result);
    }

    private static int charsSum(char[] chars) {
        int sum = 0;

        for (char c : chars) sum += c;

        return sum;
    }
}
