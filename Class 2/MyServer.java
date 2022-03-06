import java.net.*;
import java.io.*;
import java.util.*;

public class MyServer
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss= new ServerSocket(6666);
		Socket s= ss.accept();
		String str=" ", str1=" ";
		Scanner sc= new Scanner(System.in); 
		
		while(true)
		{
			DataInputStream dis= new DataInputStream(s.getInputStream());
			DataOutputStream dos= new DataOutputStream(s.getOutputStream());
			str=(String)dis.readUTF();
			System.out.println("Client says:: "+str);
			if(!str.equalsIgnoreCase("Bye"))
			{
				System.out.println("Enter a statement:: ");
				str1= sc.nextLine();
				dos.writeUTF(str1);
				dos.flush();
			}
		
		}
		
	}
}