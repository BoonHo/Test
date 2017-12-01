import java.rmi.*;

public class sharingResultImpl extends java.rmi.server.UnicastRemoteObject implements sharingResult {
	
	int same_vote1 = 0;
	int same_vote2 = 0;

	public sharingResultImpl() throws java.rmi.RemoteException {
		super();
	}

	public int combine_vote1(int vote1) throws java.rmi.RemoteException {

		int total_Vote_1 = vote1 + same_vote1;

		return total_Vote_1;
	}

	public int combine_vote2(int vote2) throws java.rmi.RemoteException {
		
		int total_Vote_2 = vote2 + same_vote2;

		return total_Vote_2;
	}
}