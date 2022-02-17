import java.util.*;

class LandAnimal1 { public void crying() {System.out.println("육지동물"); } }
class Cat11 extends LandAnimal1 { public void crying() {System.out.println("냐옹냐옹"); } }
class Dog11 extends LandAnimal1 { public void crying() {System.out.println("멍멍"); } }
class Sparrow1 { public void crying() {System.out.println("짹짹"); } }

class AnimalList1<T extends LandAnimal1> {
    ArrayList<T> al = new ArrayList<>();

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}

public class ex_106 {
    public static void main(String[] args) {
        AnimalList1<LandAnimal1> landanimal = new AnimalList1<>();  // Java SE 7부터 생략가능함.

        landanimal.add(new LandAnimal1());
        landanimal.add(new Cat11());
        landanimal.add(new Dog11());
        // landanimal.add(new Sparrow1());  // 오류가 발생함.

        for (int i = 0; i < landanimal.size(); i++) {
            landanimal.get(i).crying();
        }
    }
}
