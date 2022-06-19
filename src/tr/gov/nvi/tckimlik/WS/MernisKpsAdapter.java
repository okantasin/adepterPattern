package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class MernisKpsAdapter implements PersonCheckService{

	@Override
	public boolean checkPerson(User user) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result= kpsPublicSoapProxy
				.TCKimlikNoDogrula(Long.parseLong(user.getTcNO()),user.getName(), user.getSurName(), user.getBirthday());
	    return result;
	}

}
