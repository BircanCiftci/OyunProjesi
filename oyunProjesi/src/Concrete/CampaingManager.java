package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + "kampanyasý eklendi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + "kampanyasý güncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + "kampanyasý silindi");
		
	}
	
}
