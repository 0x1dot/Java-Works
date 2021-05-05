package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy clientKpsPublicSoapProxy = new KPSPublicSoapProxy();

		try {
			return clientKpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),
					customer.getBirthYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
	}

}
