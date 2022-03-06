import java.net.*;
import java.io.*;
import java.util.*;

public class MyClient
{
	public static void main(String args[])throws Exception
		{
		Scanner sc = new Scanner(System.in);
		String str = "",  str1 = "";
		Socket s = new Socket("localhost",6666);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getInputStream());
		System.out.println("Enter a Statement:  ");
		str = sc.nextLine();
		dos.writeUTF(str);

		str1 = (String)dis.readUTF();
		System.out.println("Length: "+str1);
		s.close();
		dos.close();
		}
}
		