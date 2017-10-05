import java.io.*;
public class ThrowsKeyword2
{
  public static void main(String[] args) throws FileNotFoundException,InterruptedException
  { 
    PrintWriter pw=new PrintWriter("abc.txt");
    pw.println("hello");
	
    Thread.sleep(10000);
    System.out.println("hello");
  }
}
