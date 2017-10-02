public class CustomizedExceptionHandling2
{
  public static void main(String[] args)
  {
    try
    {  
      System.out.println(10/0);
    }
	
    catch(ArithmeticException e)
    {
      e.printStackTrace();
      System.out.println(e);
      //java.lang.ArithmeticException: / by zero
      //at CustomizedExceptionHandling2.main(CustomizedExceptionHandling2.java:7)
      //java.lang.ArithmeticException: / by zero

      System.out.println(e.toString()); 
	  //java.lang.ArithmeticException: / by zero

      System.out.println(e.getMessage());
	  //   -> / by zero
    }
  }
}