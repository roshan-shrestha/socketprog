import java.net.*;

class PortScanner {
  public static void main (String arg[])
  {
    Socket s;

    for (int i = 1; i < 65536; i++)
    {
      try
      {
        s = new Socket(arg[0], i);
        System.out.println("Port open: "+ i);
      } catch (Exception e) {}
    }
  }
}
