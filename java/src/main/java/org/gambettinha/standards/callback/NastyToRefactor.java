package org.gambettinha.standards.callback;

public class NastyToRefactor {

	public String process1(String input){
		validate1(input);
		String thirdParyOutput = invoke1(input);
		return bindToOutput1(thirdParyOutput);
	}

	private String bindToOutput1(String thirdParyOutput) {return "";}

	private String invoke1(String input) {return "";}

	private void validate1(String input) {}

	public String process2(String input){
		validate2(input);
		String thirdParyOutput = invoke2(input);
		return bindToOutput2(thirdParyOutput);
	}

	private String bindToOutput2(String thirdParyOutput) {return "";}

	private String invoke2(String input) {return "";}

	private void validate2(String input) {}
	

}
