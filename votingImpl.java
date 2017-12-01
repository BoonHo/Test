import java.rmi.*;

public class votingImpl extends java.rmi.server.UnicastRemoteObject implements voting {

	public static int vote1;

	public static int vote2;

	
	public votingImpl() throws java.rmi.RemoteException {
		super();
	}
	public String voteOption(String options) throws java.rmi.RemoteException {

			if (options.equalsIgnoreCase("1")) {
				vote1++;

			}
			else if (options.equalsIgnoreCase("2")) {
				vote2++;
			}
			else {

				return "Please enter valid options";
			}
		
		return "";
	}

		

	public int no_of_vote_for_1() throws java.rmi.RemoteException {
		return vote1;
	}
	public int no_of_vote_for_2() throws java.rmi.RemoteException {
		return vote2;
	}
}
