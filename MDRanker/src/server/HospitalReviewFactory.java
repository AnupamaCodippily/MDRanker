package server;

import java.rmi.RemoteException;

public class HospitalReviewFactory extends ReviewFactory{
	public Review create () throws RemoteException {
		return new HospitalReview(0, null, null, 0, null);
	}
}
