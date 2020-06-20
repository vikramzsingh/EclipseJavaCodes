package test;
public class Login 
{
	public String uname,pword;
	public void login(String uname,String pword) 
	{
		this.uname=uname;
		this.pword=pword;
	}
	public void getLoginDetails()
	{
		System.out.println("username="+uname+"\nPassword="+pword);
	}

}

