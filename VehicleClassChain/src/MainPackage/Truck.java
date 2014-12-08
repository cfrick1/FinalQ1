package MainPackage;

public class Truck extends Vehicle implements VehicleInterface{
	
	private Integer NumberOfAxels;
	
	public Truck(){
	
	}
	
	public Integer getNumberOfAxels(){
		return this.NumberOfAxels;	
	}
	
	public void setNumberOfAxels(Integer NumberOfAxels){
		this.NumberOfAxels = NumberOfAxels;
	}
}
