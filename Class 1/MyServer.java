import java.net.*;
import java.io.*;

public class MyServer
{
	public static void main(String args[]) throws IOException
		{
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String str = (String)dis.readUTF();
		System.out.println("Client says:: "+str);
		ss.close();
		}
} 