/**
 * Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз.
 * При выполнении этого задания нельзя использовать дополнительные структуры данных.
 */
public class Issue1_1 {
    public static void main(String[] args) {
        solution1("SASHA");
        solution1("VICTOR");
        solution2("SASHA");
        solution2("VICTOR");
    }

    /**
     * Реализация алгоритма без использования дополнительных структур данных будет работать с квадратичной скоростю
     * speed = O(n^2), mem = O(n)
     */
    private static void solution1(String string) {
        System.out.print("solution1: ");
        System.out.print(string);
        System.out.print(" - ");

        char[] stringChars = string.toCharArray();
        boolean result = false;

        if (string.length() > 256) result = false;
        else {
            for (int i = 0; i < stringChars.length; i++) {
                for (int j = i + 1; j < stringChars.length; j++) {
                    if (stringChars[i] == stringChars[j]) result = true;
                }
            }
        }

        System.out.println(result);
    }

    /**
     * Реализация с использованием дополнительных структур данных будет работать с линейной скоростью но будет использована дополнительная память
     * speed = O(n), mem = O(2n)
     */
    private static void solution2(String string) {
        System.out.print("solution2: ");
        System.out.print(string);
        System.out.print(" - ");

        boolean result = false;
        boolean[] verificator = new boolean[256];
        char[] stringChars = string.toCharArray();

        if (string.length() > 256) result = false;
        else {
            for (char c : stringChars) {
                if (verificator[c]) result = true;
                else verificator[c] = true;
            }
        }

        System.out.println(result);
    }
}
