import java.util.*;

public class ex_95 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.binarySearch(arr, 437));
    }
}
