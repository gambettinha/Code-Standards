package org.gambettinha.standards.callback;

public interface ProcessCallback {

	void validate(String input);

	String invoke(String input);

	String bindToOutput(String thirdParyOutput);

}
