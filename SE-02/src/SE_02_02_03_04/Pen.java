package SE_02_02_03_04;

/**
 * Created by ww on 24.03.2016.
 */
public class Pen extends Writing_item {
    @Override
    public String toString() {
        return "Pen{" +"name="+name+'\''+"color="+color+'\''+
                "mark=" + mark + '\'' +
                ", ink=" + ink +'\''+"price="+price+
                '}';
    }

    public Pen(String mark, Ink ink,Color color,int price,String name) {
        this.mark = mark;
        this.ink = ink;
        this.color=color;
        this.name=name;
        this.price=price;
    }

    public String mark;
    enum Ink{
        Low,Normal,Much
    }
    Ink ink;
}
