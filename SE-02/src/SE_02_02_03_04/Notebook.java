package SE_02_02_03_04;

/**
 * Created by ww on 24.03.2016.
 */
public class Notebook extends Lists_pap {
    public int list_num;

    public Notebook(int list_num,String name,String[] note,int price) {
        this.list_num = list_num;
        this.note=note;
        this.price=price;
        this.name=name;

    }

    @Override
    public String toString() {
        return "Notebook{" +"name="+name+'\''+"note="+note+'\''+
                "list_num=" + list_num +'\''+"price="+price+
                '}';
    }
}
