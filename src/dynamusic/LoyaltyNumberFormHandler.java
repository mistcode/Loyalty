package dynamusic;

import java.io.IOException;

import atg.droplet.GenericFormHandler;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;

public class LoyaltyNumberFormHandler extends GenericFormHandler {
	private int number;
	private String setSuccessURL;

	public String getSetSuccessURL() {
		return setSuccessURL;
	}

	public void setSetSuccessURL(String setSuccessURL) {
		this.setSuccessURL = setSuccessURL;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean handleSet(DynamoHttpServletRequest request, DynamoHttpServletResponse response) throws IOException{
		if (isLoggingDebug()) {
			logDebug("Adding number for quantity visible loyalty transactions");
		}
		response.sendLocalRedirect(getSetSuccessURL(), request);
		return false;
	}	

}
