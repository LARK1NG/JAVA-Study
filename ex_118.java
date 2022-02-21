import java.util.*;

public class ex_118 {
    public static void main(String[] args) {
        LinkedList<Integer> lnkList = new LinkedList<Integer>();

        lnkList.add(4);
        lnkList.add(3);
        lnkList.add(2);
        lnkList.add(1);

        Iterator<Integer> iter = lnkList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }
    }
}
