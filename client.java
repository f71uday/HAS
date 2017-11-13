import java.io.*;
import java.net.*;

 class EchoClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s = new Socket("127.0.0.1", 3000);
			BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter w = new PrintWriter(s.getOutputStream(), true);
			BufferedReader con = new BufferedReader(new InputStreamReader(System.in));
			
		}
		catch (Exception err)
		{
			System.err.println(err);
		}
	}
}
