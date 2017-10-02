
class TooYoungException extends RuntimeException
{
  TooYoungException(String s)
  {
    super(s);
  }
}

class TooOldException extends RuntimeException
{
  TooOldException(String s)
  {
    super(s);
  }
}

public class UserDefinedException
{
  public static void main(String[] args)throws ArrayIndexOutOfBoundsException21
  {
    int age=Integer.parseInt(args[0]);
    if(age>60)
    {
      throw new TooYoungException("please wait some more time u will get best match soon");
    }
   
    else 
		if(age<18)
		{
			throw new TooOldException("ur age is already crossed marriage age...");
        }
   
        else
		{
			System.out.println("u will get match...details soon by email..!!!");
		}
  }
}