package MainPackage;

import java.util.UUID;

public class Person {
	
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public Person(){
		
	}
	
	public String getFirstName(){
		return this.FirstName;
	}
	
	public String getLastName(){
		return this.LastName;	
	}
	
	public UUID getPersonID(){
		return this.PersonID;
	}
	
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	
	public void setPersonID(){
		this.PersonID = UUID.randomUUID();
	}
	
}
