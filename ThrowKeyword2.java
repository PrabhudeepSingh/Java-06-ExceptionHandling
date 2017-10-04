public class ThrowKeyword2
{
  static ArithmeticException e= new ArithmeticException();
  
  public static void main(String[] args)
  {
    throw e; //Exception in thread "main" java.lang.ArithmeticException
  }
}