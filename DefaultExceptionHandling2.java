public class DefaultExceptionHandling2
{
  public static void main(String[] args)
  {
    doStuff();
    System.out.println(10/0); //java.lang.ArithmeticException: / by zero
  }
  public static void doStuff()
  {
    doMoreStuff();
  }
  public static void doMoreStuff()
  {
     System.out.println("hello");//hello
  }
}