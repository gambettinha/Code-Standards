package org.gambettinha.standards.noboilerplateconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:spring-beans.xml");
		MyService srvA = ac.getBean("myServiceA", MyService.class);
		MyService srvC = ac.getBean("myServiceC", MyService.class);
		
		
		System.out.println("Service A: " + srvA.toString());
		System.out.println("Service C: " + srvC.toString());
	}
}
