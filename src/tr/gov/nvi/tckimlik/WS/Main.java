package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
	UserManager userManager = new UserManager(new MernisKpsAdapter());
	userManager.add(new User(1,"43859054312","OKAN","TAŞİN",1994));
	}

}
