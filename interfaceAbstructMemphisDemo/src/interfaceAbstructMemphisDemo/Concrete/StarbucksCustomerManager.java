package interfaceAbstructMemphisDemo.Concrete;

import interfaceAbstructMemphisDemo.Abstruct.BaseCustomerManager;
import interfaceAbstructMemphisDemo.Abstruct.ICustomerCheckService;
import interfaceAbstructMemphisDemo.Abstruct.ICustomerService;
import interfaceAbstructMemphisDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager   
{
	   ICustomerCheckService customerCheckService;

	    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
	        this.customerCheckService = customerCheckService;
	    }

	    @Override
	    public void save(Customer customer) {

	        if (customerCheckService.checkIfRealPerson(customer))
	        {
	        	System.out.println("Müþteri kaydedildi."+customer.getFirstName()+" "+customer.getLasttName());
	            super.save(customer);
	            
	        } else {
	            System.out.println("Not a valid person!");
	        }

	    }
	}


	


	
