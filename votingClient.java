import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class votingClient {
	public static void main(String[] args) throws IOException, InterruptedException{

		try{
			voting v = (voting)
/*			String address = args[0];
			System.out.println(address);*/
			Naming.lookup("rmi://localhost/abc");
			System.out.println("You are client, have successfully connected to the voting server");
			System.out.println("Please wait while the server being you to the voting system");

			System.out.println("===============================================");
			System.out.println("Welcome to US Voting Election of New President");
			System.out.println("The following candidates shown below for voting:");
			System.out.print("1) Donald Trump \t 2) Hillary Clinton \n");
			System.out.println("===============================================");
			System.out.print("Please enter (1/2) to vote for the candidates: ");

			String userInput = null;
			Scanner scanInput = new Scanner(System.in);
			userInput = scanInput.nextLine();
			v.voteOption(userInput);

			while (!(userInput.equals("1")) && !(userInput.equals("2"))) {
				
				System.out.println("Please enter valid options"); 
				System.out.println("\n===============================================");
				System.out.println("Welcome to US Voting Election of New President");
				System.out.println("The following candidates shown below for voting:");
				System.out.print("1) Donald Trump \t 2) Hillary Clinton \n");
				System.out.println("===============================================");
				System.out.print("Please enter (1/2) to vote for the candidates: ");

				scanInput = new Scanner(System.in);
				userInput = scanInput.nextLine();
				v.voteOption(userInput);

			}

		


			System.out.println("Thank You for Voting.");

		}
		 catch (MalformedURLException murle) {

			System.out.println("MalformedURLException");

		}

		catch (RemoteException re) {

			System.out.println("RemoteException");
			System.out.println(re);
		}

		catch (NotBoundException nbe) {
			System.out.println(nbe + " connection is closed");
		}

		catch (java.lang.ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
		
	}
}