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
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HE201143
 *
 */
public class Serveur {

	// Port choisi par l'utilisateur.
	private static int port;
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(port);
		Socket soc = s.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintWriter out = new PrintWriter(
							new BufferedWriter(
								new OutputStreamWriter(soc.getOutputStream())), true);
		
		while (true) {
			String str = in.readLine(); // lecture du message
			if (str.equals("END")) {
				break;
			}
			System.out.println("ECHO = " + str); // trace locale
			out.println(str); // renvoi d'un écho
		}
		
		in.close();
		out.close();
		soc.close();
		s.close();
	}

}
