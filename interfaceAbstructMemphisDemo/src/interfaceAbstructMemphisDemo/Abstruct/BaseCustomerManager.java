package interfaceAbstructMemphisDemo.Abstruct;

import interfaceAbstructMemphisDemo.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	public void save(Customer customer) {
		System.out.println("Save to DB: "+customer.getFirstName());
	}
}
