import java.util.*;

public class ex_101 {
    public static void main(String[] args) {
        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        Calendar time3 = Calendar.getInstance();

        time2.set(1982, 2, 17);
        time3.set(2032, 2, 17);

        System.out.println(time1.before(time2));
        System.out.println(time1.before(time3));
    }
}
