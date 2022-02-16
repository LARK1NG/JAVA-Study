class Parent5 {
    void display() {
        System.out.println("부모 클래스의 display() 메소드입니다.");
    }
}

class Child5 extends Parent5 {
    void display() {                // 오버라이딩된 display() 메소드
        System.out.println("자식 클래스의 display() 메소드입니다.");
    }               
    void display(String str) {      // 오버로딩된 display() 메소드
        System.out.println(str);
    }
}

public class ex_63 {
    public static void main(String[] args) {
        Child5 ch = new Child5();
        ch.display();
        ch.display("오버로딩된 display() 메소드입니다.");
    }
}
