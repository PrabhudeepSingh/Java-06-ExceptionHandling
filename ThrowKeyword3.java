public class ThrowKeyword3
{
  static ArithmeticException e;
  
  public static void main(String[] args)
  {
    throw e; //Exception in thread "main" java.lang.NullPointerException
  }
}