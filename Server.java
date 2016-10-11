import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String args [])
	{
		try 
		{
			ServerSocket server = new ServerSocket(3000);
			Socket s = server.accept();
			
			System.out.println("Connected - server");
			
			
			
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Welcome to Socket!");
			
		} catch (Exception e) {}
	}
}
