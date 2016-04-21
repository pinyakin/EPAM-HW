package SE_01_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ww on 28.02.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        double a, b, h;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите a");
        a = Double.parseDouble(reader.readLine());
        System.out.println("Введите b>a");
        b = Double.parseDouble(reader.readLine());
        System.out.println("Введите шаг h");
        h = Double.parseDouble(reader.readLine());
        System.out.println("  x    |  tg(x)");
        for (double i = a; i <= b; i += h) {
            System.out.println("  "+i+"  |  " + Math.tan(i));
        }
    }
}
