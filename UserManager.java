package homework;

public class UserManager {
	public void login(User user) {
	if(user.email!=null && user.password!=null) {
		System.out.println("giri� yapildi");
	}
	else {
		System.out.println("lutfen bilgileri tam giriniz");
	}
	}

}
