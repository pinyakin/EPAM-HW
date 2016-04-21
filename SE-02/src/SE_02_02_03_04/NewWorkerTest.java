package SE_02_02_03_04;

import org.junit.Test;

import java.util.Collections;

public class NewWorkerTest {

    @org.junit.Test
    public void testGetItems() throws Exception {

    }

    @Test
    public void testCompare() throws Exception {
            NewWorker worker= new NewWorker();
            worker.getItems();
            Collections.sort(worker.items, new NamePriceComparator());
            System.out.println(worker.items.toString());

    }

    @org.junit.Test
    public void testComparePrice() throws Exception {
        NewWorker worker= new NewWorker();
        worker.getItems();
        Collections.sort(worker.items, new PriceComparator());
        System.out.println(worker.items.toString());
    }

    @org.junit.Test
    public void testCompareName() throws Exception {
        NewWorker worker= new NewWorker();
        worker.getItems();
        Collections.sort(worker.items, new NameComparator());
        System.out.println(worker.items.toString());
    }
}