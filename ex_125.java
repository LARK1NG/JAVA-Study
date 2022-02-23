public class ex_125 {
    static void handlingException() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            handlingException();
        } catch (Exception e) {
            System.out.println("main() 메소드에서 예외가 처리됨!");
        }
    }
}
