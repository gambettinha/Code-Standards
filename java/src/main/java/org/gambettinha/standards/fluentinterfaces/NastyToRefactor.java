package org.gambettinha.standards.fluentinterfaces;

public class NastyToRefactor {

	private void normalCode(Customer customer) {
		Order o1 = new Order();
		OrderLine line1 = new OrderLine(6, "TAL");
		o1.addLine(line1);
		OrderLine line2 = new OrderLine(5, "HPK");
		line2.setSkippable(true);
		o1.addLine(line2);
		OrderLine line3 = new OrderLine(3, "LGV");
		o1.addLine(line3);
		o1.setRush(true);
		customer.addOrder(o1);
	}
	
	
	private void normalCleanCode(Customer customer) {
		Order o1 = new Order();
		o1.addLine(new OrderLine(6, "TAL"));
		OrderLine line2 = new OrderLine(5, "HPK");
		line2.setSkippable(true);
		o1.addLine(line2);
		o1.addLine(new OrderLine(3, "LGV"));
		o1.setRush(true);
		customer.addOrder(o1);
	}

}
