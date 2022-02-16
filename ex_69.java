class Car6 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car6(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car6() {
        this("아반떼", 2016, "흰색", 200);
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class ex_69 {
    public static void main(String[] args) {
        Car6 car01 = new Car6();
        Car6 car02 = new Car6();

        System.out.println(car01.toString());
        System.out.println(car02.toString());
    }
}
