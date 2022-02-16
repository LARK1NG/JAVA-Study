import java.util.*;

class Car8 implements Cloneable {
	private String modelName;
	private ArrayList<String> owners = new ArrayList<String>();

	public String getModelName() { return this.modelName; }
	public void setModelName(String modelName) { this.modelName = modelName; }

	public ArrayList getOwners() { return this.owners; }
	public void setOwners(String ownerName) { this.owners.add(ownerName); }
	
	public Object clone() {
		try {
			Car8 clonedCar = (Car8)super.clone();
			clonedCar.owners = (ArrayList)owners.clone();
			return clonedCar;
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
			return null;
		}
	}
}

public class ex_71 {
	public static void main(String[] args) {
		Car8 car01 = new Car8();

		car01.setModelName("아반떼");
		car01.setOwners("홍길동");
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n");
		
		Car8 car02 = (Car8)car01.clone();
		car02.setOwners("이순신");
		System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners());
		System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners());
	}
}