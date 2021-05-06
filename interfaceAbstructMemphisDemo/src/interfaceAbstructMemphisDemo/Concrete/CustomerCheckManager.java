package interfaceAbstructMemphisDemo.Concrete;

import interfaceAbstructMemphisDemo.Abstruct.BaseCustomerManager;
import interfaceAbstructMemphisDemo.Abstruct.ICustomerCheckService;
import interfaceAbstructMemphisDemo.Abstruct.ICustomerService;
import interfaceAbstructMemphisDemo.Entities.Customer;

public  class CustomerCheckManager implements ICustomerCheckService {



	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}



	






}
