package MainPackage;

import java.util.UUID;

public abstract class Vehicle implements VehicleInterface {
	
	private String Name;
	private String Color;
	private Double Weight;
	private Person Owner;
	
	public Vehicle(){
		
	}
	
	public String getName(){
		return this.Name;
	}
	
	public String getColor(){
		return this.Color;	
	}
	
	public Double getWeight(){
		return this.Weight;
	}
	
	public Person getOwner(){
		return this.Owner;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public void setColor(String Color){
		this.Color = Color;
	}
	
	public void setWeight(Double Weight){
		this.Weight = Weight;
	}
	
	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}
}
