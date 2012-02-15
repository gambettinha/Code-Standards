package org.gambettinha.standards.callback;

public class Process {

	public String process1(String input){
		ProcessExecutor exec = new ProcessExecutor();
		return exec.process(input, new ProcessCallback() {
			
			public void validate(String input) {}
			
			public String invoke(String input) {return "";}
			
			public String bindToOutput(String thirdParyOutput) {return "";}
		});
	}
	
	public String process2(String input){
		ProcessExecutor exec = new ProcessExecutor();
		return exec.process(input, new ProcessCallback() {
			
			public void validate(String input) {}
			
			public String invoke(String input) { return "";}
			
			public String bindToOutput(String thirdParyOutput) { return ""; }
		});
	}
}
