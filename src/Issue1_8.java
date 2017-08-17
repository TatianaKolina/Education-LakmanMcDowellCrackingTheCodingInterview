import java.util.Random;

/**
 * Напишите алгоритм, реализующий следующее условие: если элемент матрицы MxN равен 0,
 * то весь столбец и вся строка обнуляются.
 */
public class Issue1_8 {
    public static void main(String[] args) {
        solution(10, 10, 5, 5);
    }

    private static void solution(int n, int m, int i, int j) {
        int matrix[][] = new int[n][m];

        Random random = new Random();
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < m; j1++) {
                matrix[i1][j1] = random.nextInt();
            }
        }

        if (matrix[i][j] == 0 || true) {
            for (int i1 = 0; i1 < n; i1++) {
                matrix[i1][j] = 0;
            }
            for (int j1 = 0; j1 < n; j1++) {
                matrix[i][j1] = 0;
            }
        }

        for (int i1 = 0; i1 < n; i1++) {
            System.out.print("|");
            for (int j1 = 0; j1 < m; j1++) {
                System.out.print(matrix[i1][j1] + " ");
            }
            System.out.println("|");
        }
    }
}
