package org.gambettinha.standards.fluentinterfaces;

public class OrderLine {
	
	private int number;
	private String sigla;
	private boolean skippable;

	public OrderLine(int i, String string) {
		number = i;
		sigla = string;
	}

	public void setSkippable(boolean b) {
		skippable = b;
	}

}
