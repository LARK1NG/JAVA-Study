interface Animal2 { public abstract void cry(); }
interface Pet { public abstract void play(); }

class Cat2 implements Animal2, Pet {
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
    public void play() {
        System.out.println("나비야~ 쥐 잡기 놀이하자~!");
    }
}
class Dog2 implements Animal2, Pet {
    public void cry() {
        System.out.println("멍멍!");
    }
    public void play() {
        System.out.println("바둑아~ 산책가자~!");
    }
}

public class ex_67 {
    public static void main(String[] args) {
        Cat2 c = new Cat2();
        Dog2 d = new Dog2();

        c.cry();
        c.play();
        d.cry();
        d.play();
    }
}
