import java.io.IOException;

public class ex_122 {
    public static void main(String[] args) {
        byte[] list = {'a', 'b', 'c'};

        try {
            System.out.write(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
