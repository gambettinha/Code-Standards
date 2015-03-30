package org.gambettinha.standards.noboilerplateconfig;


public class MyService {

	private MyDao myDao;
	
	public MyService(MyDao myDao) {
		this.myDao = myDao;
	}

	@Override
	public String toString() {
		return "MyService [myDao=" + myDao + "]";
	}
	
	
}
