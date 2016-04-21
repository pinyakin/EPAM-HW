package SE_01_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ww on 01.03.2016.
 *
 * Организовано меню в консоле с помощью переключателя switch,
 * которое упрощает работу с функиями блокнота.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        Book book=new Book();
        int i;
        System.out.print("1.Добавить запись\n2.Удалить запись\n3.Редактировать запись\n4.Посмотреть все записи");
        while (true) {
            System.out.print("\nВведите пункт меню\n");
            try {
                i = Integer.parseInt(reader.readLine());
            }
            catch (TypeNotPresentException e)
            {
                System.out.println("Неверный тип");
                continue;
            }
            switch (i) {
                case 1: {
                    System.out.println("Введите запись");
                    try {
                        book.AddNote(reader.readLine());
                    }
                    catch (TypeNotPresentException e)
                    {
                        System.out.println("Неверный тип");
                        continue;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Введите номер записи");
                    try {
                        book.deleteNote(Integer.parseInt(reader.readLine()));
                    }
                    catch (TypeNotPresentException e)
                    {
                        System.out.println("Неверный тип");
                        continue;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите номер записи");
                    int num;
                    try {
                        num = Integer.parseInt(reader.readLine());
                    }
                    catch (TypeNotPresentException e)
                    {
                        System.out.println("Неверный тип");
                        continue;
                    }
                    System.out.println("Введите запись");
                    book.correct(num,reader.readLine());
                    break;
                }
                case 4: {
                    book.show();
                    break;
                }
                default:{
                    System.out.print("Такого пункта меню нет");
                    break;
                }
            }
        }

    }
}
