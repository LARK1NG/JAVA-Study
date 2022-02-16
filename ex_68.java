interface Animal3 { public abstract void cry(); }

interface Cat3 extends Animal3 {
    public abstract void cry();
}

interface Dog3 extends Animal3 {
    public abstract void cry();
}

class MyPet implements Cat3, Dog3 {
    public void cry() {
        System.out.println("멍멍! 냐옹냐옹!");
    }
}

public class ex_68 {
    public static void main(String[] args) {
        MyPet p = new MyPet();
        p.cry();
    }
}
