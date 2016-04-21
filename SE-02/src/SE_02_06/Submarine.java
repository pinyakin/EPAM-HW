package SE_02_06;

/**
 * Created by ww on 07.04.2016.
 */
public class Submarine {
    private double speed=0;
    private double depth;
    Engine engine=new Engine();

    public Submarine(double depth) {
        this.depth = depth;
    }

    public void speedControl(){
        if(this.engine.start==true)
            while(speed<this.engine.maxSpeed){
                speed++;
                System.out.println("speed= "+speed);
            }
        else{
            while (speed>0){
                speed--;
            System.out.println("speed= "+speed);
            }
        }
    }
    public class Engine{
        final static int maxSpeed=1000;
        private boolean start;
        public void engStart() {
            start = true;
        }
        public void engStop() {
            start = false;
        }
    }
}
