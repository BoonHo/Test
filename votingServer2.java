import java.rmi.*;

public class votingServer2 {

	public votingServer2 () {

		try {

			sharingResult sr = new sharingResultImpl();
			Naming.rebind("rmi://localhost/server_to_server", sr);

		} catch (Exception e) {

			System.out.println("Server Error: "  + e);

		}
	}// end of votingServer2 constructor
	public static void main(String[] args) {
		new votingServer2();
	}
}
