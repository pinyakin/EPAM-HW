package SE_02_01;

/**
 * Created by ww on 22.03.2016.
 */
public class Pen {
    public Pen(int thickness,Color color) {
        if(color.getClass()==Color.class) {
            this.thickness = thickness;
            this.color = color;
        }
        else{
            color= Color.Black;
            thickness=1;
        }
    }

    enum Color{
        Blue,
        Red,
        Black,
        Green
    }
    int thickness;
    Color color;

    @Override
    public boolean equals(Object object){
        if(object==null)
            return false;
        Pen pen=(Pen)object;
        if(pen.getClass()!=this.getClass())
            return false;
        if(pen.thickness==this.thickness) {
            if(pen.color==this.color)
                return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return thickness;
    }

    @Override
    public String toString(){
        return "Цвет: "+color+", ширина:"+thickness;
    }




}
