package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public interface PersonCheckService {
	boolean checkPerson(User user) throws NumberFormatException, RemoteException;
	

}
