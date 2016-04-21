package SE_02_02_03_04;

import java.util.Comparator;

/**
 * Created by ww on 25.03.2016.
 */
public class PriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item1, Item item2) {
        if(item1.price==item2.price)
            return 0;
        if(item1.price>item2.price)
            return 1;
        else return -1;
    }
}
