package interfaceAbstructMemphisDemo.Adapters;

import interfaceAbstructMemphisDemo.Abstruct.ICustomerCheckService;
import interfaceAbstructMemphisDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServicesAdapter implements ICustomerCheckService {

	@Override
	 public boolean checkIfRealPerson(Customer customer)
	 {
		try {
            KPSPublicSoap client = new KPSPublicSoapProxy();

            boolean isValid = client.TCKimlikNoDogrula(
            		Long.valueOf(customer.getNationalityId()),
            		customer.getFirstName().toUpperCase(),
            		customer.getLasttName().toUpperCase()
            		,customer.getdateOfBirth().getYear());
            
            return isValid;
            
        } catch (Exception e) {

            System.out.println("Giriþ bilgileri doðru deðil");
        }
		return false;

		
	}

}
