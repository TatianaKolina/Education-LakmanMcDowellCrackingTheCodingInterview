/**
 * Реализуйте функцию void reverse(char* str) на C или C++.
 * Функция должна сдвигать строку,заканчивающуюся символом null.
 * <p>
 * Решил реализовать на Java, т.к. я данный момент слишком слаб в синтаксисе СС++.
 * В другой раз.
 */
public class Issue1_2 {
    public static void main(String[] args) {
        System.out.println(reverse(new char[]{'t', 'e', 's', 't'}));
    }

    private static char[] reverse(char[] chars) {
        char[] reverseChar = new char[chars.length];
        for (int i = chars.length - 1; i >= 0; i--)
            reverseChar[chars.length - i - 1] = chars[i];

        return reverseChar;
    }
}
