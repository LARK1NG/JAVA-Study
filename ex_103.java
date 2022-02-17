import java.util.*;

public class ex_103 {
    public static void main(String[] args) {
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        System.out.println(time1.getTime());

        time1.add(Calendar.SECOND, 60);
        System.out.println(time1.getTime());

        time2.roll(Calendar.SECOND, 60);
        System.out.println(time2.getTime());
    }
}
