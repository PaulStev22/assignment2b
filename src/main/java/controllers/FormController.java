package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.Flash;

import beans.User;

@ManagedBean
@ViewScoped


public class FormController {
	
	
	public User onSubmit(User user) {
		
		user.getfirstName();
		user.getlastName();
		
		return user ;
		
	}
	
	public User onFlash(User user) {
		
		user.getfirstName();
		user.getlastName();
		
		return user;
	}

}
