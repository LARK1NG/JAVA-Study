class Car2 {
    private String modelName = "소나타";
    private int modelYear = 2016;
    private String color = "흰색";

    public String getModel() {
        return this.modelYear + "년식 " + this.color + " " + this.modelName;
    }
}

public class ex_48 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();                // 기본 생성자 호출
        System.out.println(myCar.getModel());   // 2016년 파란색 소나타
    }
}
