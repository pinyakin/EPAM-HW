package SE_02_06;

/**
 * Created by ww on 07.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Submarine submarine=new Submarine(1000);
        submarine.engine.engStart();
        submarine.speedControl();
        submarine.engine.engStop();
        submarine.speedControl();
    }
}
