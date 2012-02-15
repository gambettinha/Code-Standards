package org.gambettinha.standards.callback;

public class ProcessExecutor {

	public String process(String input, ProcessCallback cb){
		cb.validate(input);
		String thirdParyOutput = cb.invoke(input);
		return cb.bindToOutput(thirdParyOutput);
	}
}
