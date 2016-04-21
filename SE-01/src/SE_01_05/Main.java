package SE_01_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ww on 28.02.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        int[][] A;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы n");
        n = Integer.parseInt(reader.readLine());
        A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j-1)
                    A[i][j] = 1;
                else {
                    A[i][j] = 0;
                }
                System.out.print(A[i][j] + " ");
            }
            System.out.println();

        }

    }
}
