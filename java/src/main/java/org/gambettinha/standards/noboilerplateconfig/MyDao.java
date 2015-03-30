package org.gambettinha.standards.noboilerplateconfig;

public class MyDao {

	private SqlProvider sqlProvider;
	
	public MyDao(SqlProvider sqlProvider) {
		this.sqlProvider = sqlProvider;
	}

	@Override
	public String toString() {
		return "MyDao [sqlProvider=" + sqlProvider + "]";
	}
	
	
}
