/**
 * Напишите код, заменяющий все пробелы в строке символами '%20'.
 * Можно предположить, что длина строки позволяет сохранить дополнительные символы и "истинная" длина строки тоже известна.
 */
public class Issue1_4 {
    public static void main(String[] args) {
        replace("Hello World !!!");
    }

    private static void replace(String str) {
        System.out.print("replace: " + str + " - ");
        char[] strChars = str.toCharArray();
        int spaceCounter = 0;
        int newStrCharsIndex = 0;
        for (char c : strChars) if (c == ' ') spaceCounter++;
        int newStrCharsLength = strChars.length + (spaceCounter * 3);
        char[] newStrChars = new char[newStrCharsLength];

        for (int i = 0; i < strChars.length; i++) {
            if (strChars[i] == ' ') {
                newStrChars[newStrCharsIndex++] = '%';
                newStrChars[newStrCharsIndex++] = '2';
                newStrChars[newStrCharsIndex++] = '0';
            } else {
                newStrChars[newStrCharsIndex++] = strChars[i];
            }
        }

        System.out.println(new String(newStrChars));
    }
}
