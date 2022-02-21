class Car13 implements Comparable<Car13> {
	private String modelName;
	private int modelYear;
	private String color;
	
	Car13(String mn, int my, String c) {
		this.modelName = mn;
		this.modelYear = my;
		this.color = c;
	}

	public String getModel() {
		return this.modelYear + "식 " + this.modelName + " " + this.color;
	}
	
	public int compareTo(Car13 obj) {
		if (this.modelYear == obj.modelYear) {
			return 0;
		} else if(this.modelYear < obj.modelYear) {
			return -1;
		} else {
			return 1;
		}
	}
}

public class ex_120 {
	public static void main(String[] args) {
		Car13 car01 = new Car13("아반떼", 2016, "노란색");
		Car13 car02 = new Car13("소나타", 2010, "흰색");
		
		System.out.println(car01.compareTo(car02));
	}
}