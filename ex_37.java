public class ex_37 {
    public static void main(String[] args) {
        int[] grade1 = {70, 90, 80};            // 배열의 선언과 동시에 초기화할 수 있음.
        int[] grade2 = new int[]{70, 90, 80};   // 배열의 선언과 동시에 초기화할 수 있음.
        // int[] grade3;
        // grade3 = {70, 90, 80};               // 이미 선언된 배열을 이 방법으로 초기화하면 오류가 발생함.
        int[] grade4;
        grade4 = new int[]{70, 90, 80};         // 이미 선언된 배열을 이 방법으로만 초기화할 수 있음.

        System.out.println(grade1[0]);
        System.out.println(grade2[1]);
        System.out.println(grade4[2]);

    }
}
