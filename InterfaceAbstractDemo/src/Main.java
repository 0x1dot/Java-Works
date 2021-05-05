import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args)throws RemoteException {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setNationalityId("11111111111");
		customer.setFirstName("Murat");
		customer.setLastName("Dursun");
		customer.setBirthYear(2000);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
	}
}