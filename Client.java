/**Cette classe a été créée pour le projet de java par T.Pické et J.Pletinckx.
 * 
 */
package reseau;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Thomas
 *
 */
public class Client {

	private static int port = 4330;
	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), port);
		BufferedReader in = new BufferedReader(
								new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(
							new BufferedWriter(
								new OutputStreamWriter(socket.getOutputStream())),true);
		String str = "bonjour";
		for (int i = 0; i < 10; i++) {
			out.println(str); // envoi d'un message
			str = in.readLine(); // lecture de l'écho
		}
		System.out.println("END"); // message de terminaison
		out.println("END");
		in.close();
		out.close();
		socket.close();

	}

}
