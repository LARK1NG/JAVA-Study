public class ex_38 {
    public static void main(String[] args) {
        int[] grade = new int[]{85, 65, 90};        // 길이가 3인 int형 배열의 선언과 동시에 초기화

        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i] + " ");     // 인덱스를 이용한 배열로의 접근
        }
    }
}
