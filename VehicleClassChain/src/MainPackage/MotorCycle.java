package MainPackage;

public class MotorCycle extends Vehicle implements VehicleInterface {
	
	private boolean hasSideCar;
	
	public MotorCycle(){
		
	}

	public boolean gethasSideCar(){
		return this.hasSideCar;	
	}
	
	public void sethasSideCar(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
	}
}
