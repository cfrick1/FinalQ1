package MainPackage;

public class Car extends Vehicle implements VehicleInterface {
	
	private Integer NumberOfDoors;
	
	public Car(){
		
	}
	
	public Integer getNumberOfDoors(){
		return this.NumberOfDoors;	
	}
	
	public void setNumberOfDoors(Integer NumberOfDoors){
		this.NumberOfDoors = NumberOfDoors;
	}
}
