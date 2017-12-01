import java.rmi.*;

public interface sharingResult extends java.rmi.Remote {

	public int combine_vote1(int a) throws java.rmi.RemoteException;

	public int combine_vote2(int a) throws java.rmi.RemoteException;

}
