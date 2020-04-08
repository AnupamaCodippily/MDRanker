package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartServer {
	public static void main (String args [] ) {
		try {
			
			Server server = new Server();
			
			Registry reg = LocateRegistry.createRegistry(8081);
			reg.rebind("MDRankerServer/Reviews",server);
			reg.rebind("MDRankerServer/Data",server);
			reg.rebind("MDRankerServer/Tools",server);
			
			System.out.println("Server ready");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
