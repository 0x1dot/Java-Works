package Adapter;

import java.rmi.RemoteException;

import Abstract.MernisCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy clientKpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return clientKpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),
					user.getBirthYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}
}
