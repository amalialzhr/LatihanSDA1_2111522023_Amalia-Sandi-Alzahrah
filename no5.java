import java.util.ArrayList;

public class no5 {
    
    public static void main(String[] args) {

        ArrayList hurufterakhir = new ArrayList ();
        hurufterakhir.add("A");
        hurufterakhir.add("H");
        hurufterakhir.add("R");
        hurufterakhir.add("Y");
        hurufterakhir.add("E");

        hurufterakhir.remove(4);
        hurufterakhir.remove(2);
        hurufterakhir.remove(1);

    System.out.println(hurufterakhir);
    }
}
