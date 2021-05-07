package java_campD5_HW.business.abstarcts;

import java_campD5_HW.entities.concrete.User;

public interface UserCheckService {
	boolean emailCheck(User user);
	boolean firstnameCheck(User user);
	boolean lastnameCheck(User user);
	boolean passwordCheck(User user);

}
