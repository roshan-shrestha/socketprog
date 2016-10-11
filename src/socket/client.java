package socket;

import java.net.Socket;
public class client {
	public static void main(String arg[]) 
	{
		try
		{
			Socket s = new Socket("127.0.0.1", 3000);
			System.out.println("Connected in client");

		} catch (Exception e) {}
	}
}
