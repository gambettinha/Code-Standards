package org.gambettinha.standards.fluentinterfaces;

import java.util.ArrayList;
import java.util.List;


public class Order {
	
	private List<OrderLine> lines = new ArrayList<OrderLine>();
	
	private boolean priority = false;

	public void addLine(OrderLine line) {
		lines.add(line);
	}

	public void setRush(boolean b) {
		priority = b;
		
	}
	
	public Order with(int n, String sigla){
		lines.add(new OrderLine(n, sigla));
		return this;
	}

	public Order skippable() {
		lines.get(lines.size()-1).setSkippable(true);
		return this;
	}

	public Order priorityRush() {
		this.priority = true;
		return this;
		
	}

}
