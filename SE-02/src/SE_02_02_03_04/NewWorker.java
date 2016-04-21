package SE_02_02_03_04;

import java.util.ArrayList;

/**
 * Created by ww on 24.03.2016.
 */
public class NewWorker {
    Book[] books=new Book[2];
    Notebook[] notebooks=new Notebook[2];
    Pen[] pens=new Pen[4];
    Pencil[] pencils=new Pencil[3];
    ArrayList<Item> items;

    @Override
    public String toString() {
        String str="";
        for(Item i:items){
            str+=i.toString();
        }
        return "NewWorker{" + str + '}';
    }

    public void getItems() {
        books[0] = new Book("Greeting", "P.J.Adams", "Hello", 500, 200, new String[]{""});
        books[1] = new Book("Base knowing", "R.W.Johnson", "Programming", 300, 100, new String[]{""});
        notebooks[0] = new Notebook(48, "Notebook1", new String[]{""}, 50);
        notebooks[1] = new Notebook(96, "Copybook", new String[]{""}, 90);
        pens[0] = new Pen("E.Krauser", Pen.Ink.Much, Writing_item.Color.Black, 20, "Black pen");
        pens[1] = new Pen("E.Krauser", Pen.Ink.Normal, Writing_item.Color.Blue, 10, "Blue pen");
        pens[2] = new Pen("E.Krauser", Pen.Ink.Much, Writing_item.Color.Red, 25, "Red pen");
        pens[3] = new Pen("E.Krauser", Pen.Ink.Much, Writing_item.Color.Black, 20, "Black pen2");
        pencils[0] = new Pencil(true, Writing_item.Color.Black, 10, "Black pencil");
        pencils[1] = new Pencil(true, Writing_item.Color.Blue, 12, "Blue pencil");
        pencils[2] = new Pencil(true, Writing_item.Color.Red, 15, "Red pencil");
        items=new ArrayList<Item>();

        for(Book b:books){
            items.add(b);
        }
        for(Notebook n:notebooks){
            items.add(n);
        }
        for(Pen p:pens){
            items.add(p);
        }
        for(Pencil p:pencils){
            items.add(p);
        }


    }


}
