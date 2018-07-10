package com.Hello;

import javax.ejb.Local;

@Local
public interface HelloLocal {

	public String SayHello();
	
}
