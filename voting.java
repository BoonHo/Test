import java.rmi.*;

public interface voting extends java.rmi.Remote {

	//only methods signatures  and fields are allowed here

	public String voteOption(String options) throws java.rmi.RemoteException;

	public int no_of_vote_for_1() throws java.rmi.RemoteException;

	public int no_of_vote_for_2() throws java.rmi.RemoteException;
	
}