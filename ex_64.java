class Parent6 {}
class Child6 extends Parent6 {}
class Brother extends Parent6 {}

public class ex_64 {
    public static void main(String[] args) {
        Parent6 p = new Parent6();
        System.out.println(p instanceof Object);    // true
        System.out.println(p instanceof Parent6);   // true
        System.out.println(p instanceof Child6);    // false
        System.out.println();

        Parent6 c = new Child6();
        System.out.println(c instanceof Object);    // ture
        System.out.println(c instanceof Parent6);   // ture
        System.out.println(c instanceof Child6);    // ture
    }
}
