import java.io.*;
public class FullyCheckedException
{
  public static void main(String[] args)   
  {
    try
    {
      System.out.println("hello");
    }
	
    catch(ArithmeticException e)
    {
    }
	
    /*catch(IOException e)
      {
	
      } 
       ->CE: exception IOException is never thrown in body of corresponding try statement because IOException is fully checked Exception
    */
	
    catch(Exception e)
    {
    }
  }
}