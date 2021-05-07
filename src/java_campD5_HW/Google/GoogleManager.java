package java_campD5_HW.Google;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleManager {
	public void signUp(String mail) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		if (matcher.matches()) {
			System.out.println("Added with Google account.");
		} else {
			System.out.println("Sorry.Invalid Email.");
		}
	}

}
