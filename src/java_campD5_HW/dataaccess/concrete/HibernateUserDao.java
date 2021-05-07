package java_campD5_HW.dataaccess.concrete;

import java_campD5_HW.dataaccess.abstracts.UserDao;
import java_campD5_HW.entities.concrete.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User added db successfully.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted db successfully.");
		
	}

}
