package SE_02_02_03_04;

import java.util.Comparator;

/**
 * Created by ww on 25.03.2016.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        if(item1==null||item2==null)
            return -1;
        if(item1.name.equals(item2.name))
            return 0;

        return item1.name.compareTo(item2.name);
    }
}
