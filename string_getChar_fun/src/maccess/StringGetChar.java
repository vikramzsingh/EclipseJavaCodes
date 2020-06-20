package maccess;

class StringGetChar 
{
	public static void main(String[] args) 
	{
		String str="Helloworld";
		char ch[]= new char[6];
		str.getChars(1,5,ch,0);
		System.out.println(ch);
	}
}

