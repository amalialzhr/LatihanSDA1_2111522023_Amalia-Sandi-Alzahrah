import java.sql.Array;
import java.util.ArrayList;

public class no6 {
    public static void main(String[] args) 
    {
        ArrayList<String> hurufterakhir = new ArrayList<String>();
        hurufterakhir.add("A");
        hurufterakhir.add("H");
        hurufterakhir.add("R");
        hurufterakhir.add("A");

        hurufterakhir.add(0,"e");
        System.out.println(hurufterakhir);
        
        hurufterakhir.add(2,"f");
        System.out.println(hurufterakhir);

        hurufterakhir.add(3,"g");
        System.out.println(hurufterakhir);

        hurufterakhir.add(4,"h");
        System.out.println(hurufterakhir);

        hurufterakhir.add(6,"h");
        System.out.println(hurufterakhir);

        hurufterakhir.add(-3,"j");
        System.out.println(hurufterakhir);
    }
    
}