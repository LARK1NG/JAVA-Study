import java.util.*;

class Animal4 {
    String species;
    String habitat;

    Animal4(String species, String habitat) {
        this.species = species;
        this.habitat = habitat;
    }

    public int hashCode() {
        return (species + habitat).hashCode();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Animal4) {
            Animal4 temp = (Animal4)obj;
            return species.equals(temp.species) && habitat.equals(temp.habitat);
        } else {
            return false;
        }
    }
}

public class ex_114 {
    public static void main(String[] args) {
        HashSet<Animal4> hs = new HashSet<Animal4>();

        hs.add(new Animal4("고양이", "육지"));
        hs.add(new Animal4("고양이", "육지"));
        hs.add(new Animal4("고양이", "육지"));

        System.out.println(hs.size());
    }
}
