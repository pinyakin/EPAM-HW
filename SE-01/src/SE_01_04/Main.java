package SE_01_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ww on 28.02.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int n;
        double[] A,B;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество элементов в массиве");
        n = Integer.parseInt(reader.readLine());
        A=new double[2*n];
        B=new double[n];
        System.out.println("Введите через Enter элементы массива");
        for(int i=0;i<2*n;i++)
        {
            A[i]=Double.parseDouble(reader.readLine());
        }
        for(int i=0;i<n;i++)
        {
            B[i]=(A[i]+A[2*n-1-i]);
        }
        System.out.print("Max = "+Max(B));

    }
    private static double Max(double[] A)
    {
        double d=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(d<A[i]) {
                d = A[i];
            }

        }
        return d;
    }
}
