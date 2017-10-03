public class MultiCatchBlock
{
  public static void main(String[] args)
  {
    try
    {
      String s=null;
      System.out.println(s.length());
      System.out.println(10/0);
    }
	
    catch(ArithmeticException | NullPointerException e)
    { 
	System.out.println(e);
    }
  }
}