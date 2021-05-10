package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServis implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirtsName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getYearOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}

}
