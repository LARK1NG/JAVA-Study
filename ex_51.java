class Test1 {
    static void display(int num1) { System.out.println(num1); }
    static void display(int num1, int num2) { System.out.println(num1 * num2); }
    static void display(int num1, double num2) { System.out.println(num1 + num2); }
}

public class ex_51 {
    public static void main(String[] args) {
        Test1 myfunc = new Test1();
        myfunc.display(10);
        myfunc.display(10, 20);
        myfunc.display(10, 3.14);
        myfunc.display(10, 'a');
    }
}
