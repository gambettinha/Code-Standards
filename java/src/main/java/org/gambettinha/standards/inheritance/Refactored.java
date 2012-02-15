package org.gambettinha.standards.inheritance;

public class Refactored {
	public String getInfo(Type t){
		return t.getString();
	}
}

abstract class Type{ 
	public String getString(){return "0";}
}

class Type1 extends Type{
	public String getString(){return "1";}
}

class Type2 extends Type{
	public String getString(){return "2";}
}