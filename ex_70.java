class Car7 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car7(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car7() {
        this("아반떼", 2016, "흰색", 200);
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class ex_70 {
    public static void main(String[] args) {
        Car7 car01 = new Car7();
        Car7 car02 = new Car7();
        System.out.println(car01.equals(car02));

        car01 = car02;          // 두 참조 변수가 같은 주소를 가리킴.
        System.out.println(car01.equals(car02));
    }
}
