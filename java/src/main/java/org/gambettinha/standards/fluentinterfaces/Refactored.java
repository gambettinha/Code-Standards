package org.gambettinha.standards.fluentinterfaces;

public class Refactored {
	
	 private void fluent(Customer customer) {
	        customer.newOrder()
	                .with(6, "TAL")
	                .with(5, "HPK").skippable()
	                .with(3, "LGV")
	                .priorityRush();
	    }

}
