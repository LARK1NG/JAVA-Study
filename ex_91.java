enum Rainbow { RED, ORANGE, YELLOW, GREEN, BULE, INDIGO, VIOLET }

public class ex_91 {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();

        for (Rainbow rb : arr) {
            System.out.println(rb);
        }
    }
}
