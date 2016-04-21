package SE_01_06;

import java.util.ArrayList;

/**
 * Created by ww on 01.03.2016.
*/

/**
 * Создание нового блокнота для записей.
 *
 *      Создание нового блокнота для записей.Данный класс позволяет создававть блокнот, в
 *       который можно добавить и обработь записи.Хранит записи Note в ArrayList.
 */
public class Book {

    public ArrayList<Note> notes=new ArrayList<Note>();

    /**
     *Создать новую запись в блокнот.
     *
     * @param text текст новой записи
     */
    public void AddNote(String text){
        notes.add(new Note(text));
    }

    /**
     * Удаление записи в блокноте.
     *
     * @param num номер записи для удаления
     */
    public void deleteNote(int num){

        if(num>=notes.size()){

        }
        try {
            notes.remove(num);
        }
        catch(TypeNotPresentException e)
        {
            System.out.println("Неверный тип");
            return;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Такой записи нет");
            return;
        }
    }

    /**
     * Редактирование записи в блокноте.
     *
     * @param num номер записи, которую редактируем
     * @param text новое содержание данной записи
     */
    public void correct(int num,String text){
        try {
            notes.set(num, new Note(text));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Такой записи нет");
            return;
        }
    }

    /**
     * Отображение содежимого блокнота.
     *
     * Данный метод с помощью цикла for выводит все записи в порядке их номера.
     */
    public void show()
    {
        for(int i=0;i<notes.size();i++){
            System.out.println(i + ". " + notes.get(i).text);
        }
    }
}
