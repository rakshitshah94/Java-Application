import java.io.*;
import java.net.*;
import java.util.Hashtable;

public class Server
{
  // @System     HP-pc Rax
  // @author     Rakshit shah <Rakshitshah1994@gmail.com>
  // @copyright  2015-2017 |Rakshit shah
  // @version    1.1
  // @since      File available since Release 1.0.0
	public static void main(String []args)
	{
		try
		{
			// Create a socket on server
			ServerSocket ss = new ServerSocket(555);

			// hashtable to manage list of online and offline users
			Hashtable tOnlineUsers = new Hashtable(10);
			Hashtable tOfflineUsers = new Hashtable(10);

			// ---------------------------------------------------------------
			// Now start accepting connections from clients in a while loop
			// The server should run in an infinite loop
			while(true)
			{
				Socket socket = ss.accept();	// accept connection from client
				System.out.println("A new client is connected.");

				// to get data to and from server
				InputStream in = socket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				OutputStream out = socket.getOutputStream();
				PrintWriter pr = new PrintWriter(out, true);

				// read user name from the client and store in table
				// in the format username + socket
				String strUserName = br.readLine();
				System.out.println("Username: " + strUserName + "\n");
				tOnlineUsers.put(strUserName, socket);

				// create a thread to allow simultaneous connections
				Worker w = new Worker(socket, tOnlineUsers, tOfflineUsers, strUserName);
				w.start();
			}	// End of while

		}	// End of try
		catch(Exception e)
		{
			System.out.println("Some kind of error has occurred.");
		}	// End of exception

	}	// End of main()
}	// End of class
