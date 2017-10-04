public class ThrowKeyword4 extends RuntimeException
{
  public static void main(String[] args)
  {
    throw new ThrowKeyword4();//Exception in thread "main" at ThrowKeyword3
  }
}
//at compile time there is no because ThrowKeyword34 is throwable type