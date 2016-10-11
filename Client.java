import java.net.*;
import java.io.*;

public class Client {
	public static void main (String args[])
	{
		try
		{
			Socket s = new Socket("127.0.0.1", 3000);
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			
			String msg = dis.readUTF();
			
			System.out.println(msg);
		} catch (Exception e) {};
	}
}
