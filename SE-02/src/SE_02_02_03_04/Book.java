package SE_02_02_03_04;

/**
 * Created by ww on 24.03.2016.
 */
public class Book extends Lists_pap {
    public String author;
    public String theme;

    public Book(String theme, String author,String name,int price,int list_num,String[] text) {
        this.theme = theme;
        this.author = author;
        this.price = price;
        this.name=name;
        this.list_num=list_num;
        this.note=text;
    }


    public void setName(String name){
        this.name=name;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public void setList_num(int listNum){
        this.list_num=listNum;
    }

    public void setText(String[] text){
        this.note=text;
    }

    @Override
    public String toString() {
        return "Book{" +"name="+name+'\'' +
                "author=" + author + '\'' +
                ", theme=" + theme + '\'' +
                "price="+price+
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}
