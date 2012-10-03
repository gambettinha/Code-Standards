package org.gambettinha.standards.jasper.crosstab;

public class CrossTabBean {
	
	String header;     
	String row;     
	String value;
	
	public CrossTabBean() {}
	
	public CrossTabBean(String header, String row, String value) {
		super();
		this.header = header;
		this.row = row;
		this.value = value;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}