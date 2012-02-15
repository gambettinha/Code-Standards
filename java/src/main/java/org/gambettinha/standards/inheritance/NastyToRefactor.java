package org.gambettinha.standards.inheritance;

public class NastyToRefactor {

	public String getInfo(Object o){
		if(o instanceof NastyType1) return "1";
		if(o instanceof NastyType2) return "2";
		return "0";
	}
}


class NastyType1{}
class NastyType2{}