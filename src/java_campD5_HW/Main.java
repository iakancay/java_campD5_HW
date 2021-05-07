package java_campD5_HW;


import java_campD5_HW.business.concrete.UserManager;
import java_campD5_HW.core.adapter.GoogleServiceAdapter;
import java_campD5_HW.entities.concrete.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"ibrahim","Akancay","iakancay@gmail.com","123456");
		User user2=new User(2,"Engin","Demirog","engindemir.mail","1234567");
		User user3=new User(3,"ismail","Akancay","iakancay@gmail.com","123456");
		User user4= new User(3,"ismail","Akancay","iakancay@gmail.com","");
		UserManager userManager=new UserManager(new GoogleServiceAdapter());
		userManager.add(user1);
		userManager.addWithGoogle(user2);
		userManager.add(user3);
		userManager.login(user4);
		
		  }

}
