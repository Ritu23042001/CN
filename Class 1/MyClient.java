import java.net.*;
import java.io.*;

public class MyClient
{
	public static void main(String args[]) throws IOException
		{
		Socket s = new Socket("localhost",6666);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hello Server");
		s.close();
		dos.close();
		}
} 