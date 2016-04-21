package SE_02_02_03_04;

/**
 * Created by ww on 24.03.2016.
 */
public class Pencil extends Writing_item {
    public boolean ready;

    @Override
    public String toString() {
        return "Pencil{"+"name=" +name+'\''+"color="+color+'\''+
                "ready=" + ready +'\''+"price="+price+
                '}';
    }

    public Pencil(boolean ready,Color color,int price,String name) {
        this.ready = ready;
        this.color=color;
        this.price=price;
        this.name=name;
    }
}
