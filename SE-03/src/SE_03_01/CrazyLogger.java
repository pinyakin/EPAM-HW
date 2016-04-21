package SE_03_01;
import java.util.Calendar;
import java.util.Formatter;
/**
 * Created by ww on 17.04.2016.
 */
public class CrazyLogger {
    StringBuilder sb=new StringBuilder();
    Calendar calendar=Calendar.getInstance();
    Formatter formatter=new Formatter();
    public CrazyLogger(){
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        formatter.format("%02d-%02d-%4d : %02d-%02d - ", day,month + 1,year,hour, minute);
    }
    public void log(String message)
    {
        sb.append(formatter+message+";\n");
    }
    public StringBuilder search(String message)
    {
        String[]strings=sb.toString().split(";");
        StringBuilder stringBuilder=new StringBuilder();
        for(String s:strings){
            if(s.contains(" - "+message))
                stringBuilder.append(s+";");
        }
        return stringBuilder;
    }


    public static void main(String[] args) {
        CrazyLogger logger=new CrazyLogger();
        logger.log("Audi");
        logger.log("Opel");
        logger.log("Bmw");
        logger.log("Bmw");
        logger.log("Opel");
        logger.log("Bmw");
        System.out.println(logger.sb+"\n");
        System.out.println(logger.search("Bmw"));

    }
}
