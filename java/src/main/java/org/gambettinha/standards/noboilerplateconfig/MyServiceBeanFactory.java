package org.gambettinha.standards.noboilerplateconfig;


public class MyServiceBeanFactory {
	
	public MyService newMyService(String sql){
		return new MyService(new MyDao( new SqlProvider(sql)));
	}


}
