import java.util.Random;

/**
 * Имеется изображение, представленное матрицей NxN; каждый пиксель представлен 4 байтами.
 * Напишите метод для поворота изображения на 90 градусов.
 * Удастся ли вам выполнить это операцию на месте?
 */
public class Issue1_7 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        int SIZE = 4 ;

        int[][] matrix = new int[SIZE][SIZE];
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                matrix[i][j] = random.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();

        int[][] newMatrix = new int[SIZE][SIZE];
        for (int j = matrix.length - 1; j >= 0; j--)
            for (int i = matrix[j].length - 1; i >= 0; i--) {
                newMatrix[matrix.length - i - 1][j] = matrix[j][i];
            }

        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
