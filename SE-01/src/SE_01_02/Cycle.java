package SE_01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ww on 27.02.2016.
 */
public class Cycle {
    public static void main(String[] args) throws IOException {
        double e;
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите точность e");
        try {
            e=Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e1) {
            System.out.print("Ошибка формата");
            e1.printStackTrace();
            return;
        } catch (IOException e1) {
            System.out.print("Ошибка ввода");
            e1.printStackTrace();
            return;
        }
        if(e>1/4||e<=0)
        {
            System.out.print("Некорректоное значение");
            return;
        }
        for(int i=1;;i++)
        {
            if(1/Math.pow(i,2)<e)
            {
                System.out.print("n = "+i);
                return;
            }
        }
    }
}
