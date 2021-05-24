package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class User {
	
	private String firstName;
	
	private String lastName;
	
	public User(){
		
		this.firstName = "Paul";
		this.lastName = "Stevenson";
		
	}
	
	



public String getfirstName(){
	
	return firstName;
	
	
}

public String getlastName() {
	return lastName;
}





public void setFirstName(String firstName) {
	this.firstName = firstName;
}





public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
