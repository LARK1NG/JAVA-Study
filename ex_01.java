class Test {    // 클래스 이름
    int field1; //필드의 선언
    String field2;  //필드의 선언

    public void method1() { //메소드의 선언
        System.out.println("자바 프로그래밍!!");    //메소드의 선언
    }
}

public class ex_01 {

    public static void main(String[] args) {
        Test myTest = new Test();
        myTest.method1();
    }
}