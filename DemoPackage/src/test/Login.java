package test;
// hyderabad written
public class Login 
{
	public String uName,pWord;
	public Login(String uName, String pWord) 
	{
		this.uName=uName;
		this.pWord=pWord;
	}
	public void getLoginDetails()
	{
		System.out.println("uname:"+uName);
		System.out.println("pword:"+pWord);
	}

}
