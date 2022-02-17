import java.util.*;

class LandAnimal2 { public void crying() { System.out.println("육지동물"); } }
class Cat12 extends LandAnimal2 { public void crying() { System.out.println("냐옹냐옹"); } }
class Dog12 extends LandAnimal2 { public void crying() { System.out.println("멍멍"); } }
class Sparrow2 { public void crying() { System.out.println("짹짹"); } }

class AnimalList2<T> {
    ArrayList<T> al = new ArrayList<T>();

    public static void cryingAnimalList(AnimalList2<? extends LandAnimal2> al) {
        LandAnimal2 la = al.get(0);
        la.crying();
    }

    void add(T animal) { al.add(animal); }
    T get(int index) { return al.get(index); }
    boolean remove(T animal) { return al.remove(animal); }
    int size() { return al.size(); }
}

public class ex_107 {
    public static void main(String[] args) {
        AnimalList2<Cat12> catList = new AnimalList2<Cat12>();
        catList.add(new Cat12());
        AnimalList2<Dog12> dogList = new AnimalList2<Dog12>();
        dogList.add(new Dog12());

        AnimalList2.cryingAnimalList(catList);
        AnimalList2.cryingAnimalList(dogList);
    }
}
