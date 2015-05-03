package Assign3;

public class User {
	
	private String user;
	private String email;
	private int perm;

	public User(String user, String email, int perm){
		this.user = user;
		this.email = email;
		this.perm = perm;
	}
	
	public void setUser(String user){
		this.user = user;
	}
	
	public String getUser(){
		return user;
	}
	
	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
	
	public void setPermission(int perm){
		this.perm = perm;
	}
	
	public int getPermission() {
		return perm;
	}
	
}

