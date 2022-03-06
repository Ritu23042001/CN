import java.net.*;

import java.io.*;

public class MyServer
{
	public static void main(String args[]) throws Exception
	{
	Serversocket ss = new ServerSocket (6666); 
	System.out.println("Server is running...");
	Socket s = ss.accept(); 
	DataOutputStream dos= new DataOutputStream(s.getOutputStream()); 
	DataInputStream dis = new DataInputStream(s.getInputStream()); 
	String str = (string)dis. readUTF();
	System.out.println("Client says:: "+str);
	int length = str.length();
	String strl = String.valueof (length); 
	dos.writeUTF(str1); 
	//ss.close();
	}
}