package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartServer {
	public static void main (String args [] ) {
		try {
			Registry reg = LocateRegistry.createRegistry(8081);
			reg.rebind("MDRankerServer/Reviews",new Server());
			reg.rebind("MDRankerServer/Data",new Server());
			
			System.out.println("Server ready");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
