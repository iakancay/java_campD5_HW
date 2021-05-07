package java_campD5_HW.business.concrete;

import java.util.ArrayList;


import java_campD5_HW.business.abstarcts.UserService;
import java_campD5_HW.core.abstarcts.GoogleService;
import java_campD5_HW.entities.concrete.User;

public class UserManager implements UserService {
	ArrayList<String> emails = new ArrayList<String>();
	UserCheckManager userCheckManager = new UserCheckManager();
	GoogleService googleService;

	public UserManager(GoogleService googleService) {
		super();
		this.googleService = googleService;
	}

	@Override
	public void add(User user) {
		if (userCheckManager.emailCheck(user) == false) {
			System.out.println("Please enter valid email.");
		} else if (emails.indexOf(user.getEmail()) != -1) {
			System.out.println("This email was added before.Please enter new email.");
		} else if (userCheckManager.firstnameCheck(user) == false) {
			System.out.println("Firstname must be at least 3 character.");
		} else if (userCheckManager.lastnameCheck(user) == false) {
			System.out.println("Lastname must be at least 3 character.");
		} else if (userCheckManager.passwordCheck(user) == false) {
			System.out.println("Password must be at least 6 character.");
		} else {
			System.out.println("Registiration successful.");
			System.out.println("verification email has been sent.");
			emails.add(user.getEmail());
		}

	}

	@Override
	public void addWithGoogle(User user) {
		googleService.signUpWith(user);

	}

	@Override
	public void login(User user) {
		if(user.getEmail().length()==0) {
			System.out.println("Email required.");
		}
		else if(user.getPassword().length()==0) {
			System.out.println("Password required.");
		}
		else {
			System.out.println("Login succesfull");
		}

	}

	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" logged out.");

	}

}
