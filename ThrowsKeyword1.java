import java.io.*;
public class ThrowsKeyword1
{
  public static void main(String[] args)
  { 
    PrintWriter pw=new PrintWriter("abc.txt");
	
    pw.println("hello"); //CE: unreported exception FileNotFoundException; must be caught or declared to be thrown
    Thread.sleep(10000); //CE: unreported exception InterruptedException; must be caught or declared to be thrown
  }
}
