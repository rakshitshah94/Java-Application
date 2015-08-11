import java.io.*;
import java.net.*;
import java.util.*;

public class Worker extends Thread
{

  // @System     HP-pc Rax
  // @author     Rakshit shah <Rakshitshah1994@gmail.com>
  // @copyright  2015-2017 |Rakshit shah
  // @version    1.1
  // @since      File available since Release 1.0.0
 
	Socket socket;
	Hashtable tOnlineUsers;
	Hashtable tOfflineUsers;
	String strUserName;

	// -----------------constructor------------------------
	public Worker(Socket s, Hashtable online, Hashtable offline, String userName)
	{
		socket = s;
		tOnlineUsers = online;
		tOfflineUsers = offline;
		strUserName = userName;
	}	// End of constructor

	// -------------------run------------------------------
	public void run()
	{
		try
		{
			// to get data to and from server
			InputStream in = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			OutputStream out = socket.getOutputStream();
			PrintWriter pr = new PrintWriter(out, true);

			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String strAnother="", strResult="";

			while(!strAnother.equals("d"))
			{
				strResult = "";
				strAnother = br.readLine();	// read option
				System.out.println("User option is " + strAnother);
				switch(strAnother.charAt(0))
				{
					case 'd':
						System.out.println("Request for disconnect.");
						break;
					case 's':		// print a list of online people
						System.out.println("Sending list of online people....\n");
						Enumeration e = tOnlineUsers.keys();
						while (e.hasMoreElements())
							strResult += e.nextElement() + ", ";
						pr.println(strResult);
						break;
					case 'z':
						System.out.println("Calculating result and sending answer....\n");
						String strInt1 = br.readLine();
						String strInt2 = br.readLine();
						String strOp = br.readLine();
						int int1 = Integer.parseInt(strInt1);
						int int2 = Integer.parseInt(strInt2);
						char chOp = strOp.charAt(0);
						String strCalcResult = "";
						switch(chOp)
						{
							case '+':
								strCalcResult = "The result is "+(int1+int2); break;
							case '-':
								strCalcResult = "The result is "+(int1-int2); break;
							case '*':
								strCalcResult = "The result is "+(int1*int2); break;
							case '/':
								strCalcResult = "The result is "+(int1/int2); break;
							default:
								strCalcResult = "The Operator is invalid."; break;
						}
						pr.println(strCalcResult);

						break;
				}	// End of switch
			}	// End of while

			// Now, close the socket after deleting that socket from online list
			Socket s = (Socket)tOnlineUsers.remove(strUserName);
			tOfflineUsers.put(strUserName, s);
			socket.close();

		}	// End of try
		catch(Exception e)
		{
			System.out.println("Error has occurred in Worker.");
		}	// End of exception

	}	// End of run()

}	// End of class
