package SE_03_02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Enumeration;

/**
 * Created by ww on 17.04.2016.
 */
public class ENRU {

    public static void main(String[] args) throws IOException {
        Locale locale = null;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1-RU\n2-EN");
        try {
            switch (reader.readLine()){
                case "1": {
                    locale=new Locale("ru","RU");
                    break;
                }
                case "2": {
                    locale=new Locale("en","US");
                    break;
                }
                default:  locale=new Locale("ru","RU");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ResourceBundle resourceBundle=ResourceBundle.getBundle("SE_03_02.questions",locale);
        ResourceBundle resourceBundle1=ResourceBundle.getBundle("SE_03_02.answers",locale);
       // System.out.println(locale);
//        Set<String> keys=resourceBundle.keySet();
//        System.out.println(keys);
//        for(String str:keys){
//            System.out.println(resourceBundle.getString(str));
//        }
//        System.out.println(keys.toArray()[Integer.parseInt(reader.readLine())-1]);
//
//        System.out.println("\n"+ resourceBundle.getString("Mew"));
        Enumeration keys=resourceBundle.getKeys();
        while(keys.hasMoreElements()){
            Object key=keys.nextElement();
            System.out.println(resourceBundle.getString((String)key));
        }
        System.out.println(resourceBundle1.getString("a"+reader.readLine()));
    }


}

