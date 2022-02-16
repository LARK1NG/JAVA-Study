class Parent4 {
    void display() {
        System.out.println("부모 클래스의 display() 메소드입니다.");
    }
}

class Child4 extends Parent4 {
    void display() {
        System.out.println("자식 클래스의 display() 메소드입니다.");
    }
}

public class ex_62 {
    public static void main(String[] args) {
        Parent4 pa = new Parent4();
        pa.display();
        Child4 ch = new Child4();
        ch.display();
        Parent4 pc = new Child4();
        pc.display();
        // Child4 cp = new Parent4();
    }
}
