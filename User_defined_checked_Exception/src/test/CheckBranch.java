package test;
@SuppressWarnings("serial")

public class CheckBranch extends Exception {
	
	public CheckBranch()
	{
		
	}//main method const call
	
	public CheckBranch(String msg)
	{
		super(msg);
	}
		public void verify(String br) 
		throws CheckBranch //throws keyword with verify method re-throw ob object to where method is called.
		{
			try
			{
				switch (br) {
				case "cse":
					break;
					
				case "ece":
					break;
					
				case "eee":
					break;
				
				default: //Exception
					CheckBranch ob = new CheckBranch("Branch does not exist");
					throw ob; //this ob object throw to this try's catch block
				}
			}
			catch(CheckBranch ob)
			{
				throw ob; //re-throw
			}
		}

	}

