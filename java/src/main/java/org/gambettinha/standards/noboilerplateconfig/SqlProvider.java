package org.gambettinha.standards.noboilerplateconfig;

public class SqlProvider {
	
	private String mySql;
	
	public SqlProvider(String mySql){
		this.mySql = mySql;
	}
	
	public String getMySql() {
		return mySql;
	}

	@Override
	public String toString() {
		return "SqlProvider [mySql=" + mySql + "]";
	}
	
	

}
