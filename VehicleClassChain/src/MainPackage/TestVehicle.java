package MainPackage;

public class TestVehicle {
	public static void main(String[] args){
		Person a = new Person();
		Car a1 = new Car();
		a1.transferOwnership(a);
		a1.setNumberOfDoors(4);
		Truck a2 = new Truck();
		a2.setNumberOfAxels(2);
		a2.transferOwnership(a);
		Person b = new Person();
		a2.transferOwnership(b);
		MotorCycle a3 = new MotorCycle();
		a3.sethasSideCar(false);	
	}

}
