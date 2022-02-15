public class ex_42 {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20},
            {10, 20, 30, 40},
            {10}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
