package interfaceAbstructMemphisDemo;

import java.sql.Date;
import java.time.LocalDate;


import interfaceAbstructMemphisDemo.Abstruct.BaseCustomerManager;
import interfaceAbstructMemphisDemo.Concrete.NeroCustomerManager;
import interfaceAbstructMemphisDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstructMemphisDemo.Entities.Customer;
import interfaceAbstructMemphisDemo.Adapters.MernisServicesAdapter;
public class Main {

	public static void main(String[] args) {


		
		  BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServicesAdapter());

		customerManager.save(new Customer(1, "Mehmet", "Þimþek", LocalDate.of(1998,10,8), "61489378400"));
		
		
		
		

	}

}
