package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class UserManager {
	
	private PersonCheckService personCheckService;

	public UserManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}
	
		
		public void add(User user) throws NumberFormatException, RemoteException {
			if(this.personCheckService.checkPerson(user)) {
				System.out.println("Person exits");
			}else {
				System.out.println("person not exits");
			}
		
		
	}
	
}
