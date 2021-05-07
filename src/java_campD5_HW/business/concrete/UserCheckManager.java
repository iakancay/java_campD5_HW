package java_campD5_HW.business.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java_campD5_HW.business.abstarcts.UserCheckService;
import java_campD5_HW.entities.concrete.User;


public class UserCheckManager implements UserCheckService {
	

	@Override
	public boolean emailCheck(User user) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		return matcher.matches();
		
	}

	@Override
	public boolean firstnameCheck(User user) {
		if(user.getFirstName().length()>2) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean lastnameCheck(User user) {
		if(user.getLastName().length()>2) {
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length()>5) {
			return true;
		}else {
		return false;
		}
	}

}
