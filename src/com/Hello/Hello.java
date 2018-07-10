package com.Hello;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Hello
 */
@Stateless
public class Hello implements HelloLocal {

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }
    
	public String SayHello() {
		return "Hello from EJB!";
	}

}
