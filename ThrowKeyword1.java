public class ThrowKeyword1
{
  public static void main(String[] args)
  {
    throw new ArithmeticException("/ by zero");//Exception in thread "main" java.lang.ArithmeticException: / by zero
   
   //System.out.println("hello");  -> CE: unreachable statement
    
    //throw new ThrowKeyword();  -> CE: incompatible types: ThrowKeyword cannot be converted to Throwable
  }
}