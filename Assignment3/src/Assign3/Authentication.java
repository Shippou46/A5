package Assign3;

import DB.MyDB;

public class Authentication {

	public static Session login(String user, String password, MyDB db){
		User u;
		if((u = db.login(user, password)) != null){
			return new Session(u);
		}
		return null;
	}
}
