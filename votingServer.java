import java.rmi.*;


public class votingServer {

	public votingServer() {
		
		try {
			System.out.println("You are now acting as Server");
			System.out.println("Connection Established... Waiting for client to connect");

			voting v = new votingImpl();
			Naming.rebind("rmi://localhost/abc", v);

			Thread.sleep(10000);


			Naming.unbind("rmi://localhost/abc");

			int a = v.no_of_vote_for_1();

			int b = v.no_of_vote_for_2();

			System.out.println("The number of votes for Donald Trump are : " + a);

			System.out.println("The number of votes for Hillary Clinton are: " + b);

			System.out.println("Now acting as Client");


			sharingResult sr = (sharingResult)	
			Naming.lookup("rmi://localhost/server_to_server");

			int getTotalVote1 = sr.combine_vote1(a);
			System.out.println("The total number of votes for Donald Trump are: " + getTotalVote1);

			int getTotalVote2 = sr.combine_vote2(b);
			System.out.println("The total number of votes for Hillary Clinton are: " + getTotalVote2);



		}

		catch (Exception e) {
			System.out.println("Server Error: "  + e);
		}
	}
	public static void main(String[] args) {
		new	votingServer();
	}
	
}