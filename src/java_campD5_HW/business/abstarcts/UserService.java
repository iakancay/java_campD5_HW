package java_campD5_HW.business.abstarcts;

import java_campD5_HW.entities.concrete.User;

public interface UserService {
	void add(User user);
	void addWithGoogle(User user);
	void login(User user);
	void logout(User user);

}
