import java.util.ArrayList;

public class no3 {
    
    public static void main(String[] args) {
        ArrayList<String> hurufterakhir = new ArrayList<String>();
        hurufterakhir.add("A");
        hurufterakhir.add("H");
        hurufterakhir.add("R");
        hurufterakhir.add("A");

        System.out.println(hurufterakhir.get(0));
        System.out.println(hurufterakhir.get(2));
        System.out.println(hurufterakhir.get(6));
        System.out.println(hurufterakhir.get(-3));
    }

}

