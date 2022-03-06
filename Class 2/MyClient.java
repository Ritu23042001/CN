import java.net.*;
import java.io.*;
import java.util.*;

public class MyClient
{
	public static void main(String args[]) throws Exception
	{
		Socket s= new Socket("localhost",6666);
		String str="", str1="";
		Scanner sc= new Scanner(System.in); 
		
		while(true)
		{
			DataInputStream dis= new DataInputStream(s.getInputStream());
			DataOutputStream dos= new DataOutputStream(s.getOutputStream());
			
			if(!str1.equalsIgnoreCase("Bye"))
			{
				System.out.println("Enter a statement:: ");
				str= sc.nextLine();
				dos.writeUTF(str);
				dos.flush();
				str1=(String)dis.readUTF();
				System.out.println("Server says:: "+str1);
				
			}			

		}
	}
}