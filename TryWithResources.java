import java.io.*;

class TryWithResources
{
  public static void main(String[] args)throws Exception
  {
    try(BufferedReader br=new BufferedReader(new FileReader("input.txt")))
    {
      // br=new BufferedReader(new FileReader("out.txt"));   ->CE: auto-closeable resource br may not be assigned
    }
  }
}