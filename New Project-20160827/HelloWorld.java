import java.text.SimpleDateFormat;
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, 180); 
        String output = sdf.format(c.getTime());
        System.out.println(output);
     }
}
