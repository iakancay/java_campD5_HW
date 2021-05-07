package java_campD5_HW.core.adapter;

import java_campD5_HW.Google.GoogleManager;
import java_campD5_HW.core.abstarcts.GoogleService;
import java_campD5_HW.entities.concrete.User;

public class GoogleServiceAdapter implements GoogleService {
	GoogleManager manager = new GoogleManager();

	@Override
	public void signUpWith(User user) {

		manager.signUp(user.getEmail());
	}

}
