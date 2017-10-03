public class ExceptionExamples
{
  
  public static void m1()
  {
	  m2();
  }
  
  public static void m2()
  {
	  m1();
  }

  public static void main(String[] args)
  { 
     //m1();  -> E:java.lang.StackOverflowError

     int[] x=new int[5];
     System.out.println(x[0]);
     //System.out.println(x[10]);  -> RE:java.lang.ArrayIndexOutOfBoundsException: 10

     String s=null;
     //System.out.println(s.length());  -> RE:java.lang.NullPointerException
    
     Object o=new Object();
     //String s1=(String)o;  -> RE:java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
         
     //static int y=10/0;  ->RE: error: illegal start of expression
     
     Thread t=new Thread();
     t.setPriority(7);
     //t.setPriority(15);   -> RE:java.lang.IllegalArgumentException
   
     //int i=Integer.parseInt("ten");  -> RE:java.lang.NumberFormatException
      
     t.start();
     //t.start();  ->RE:java.lang.IllegalThreadStateException
  }
}
