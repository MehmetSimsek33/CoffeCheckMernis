package interfaceAbstructMemphisDemo.Concrete;

import interfaceAbstructMemphisDemo.Abstruct.BaseCustomerManager;
import interfaceAbstructMemphisDemo.Entities.Customer;


public class NeroCustomerManager  extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName());		
	}

}
