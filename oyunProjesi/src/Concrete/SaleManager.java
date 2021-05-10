package Concrete;

import Abstract.SaleService;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	private Campaing campaing;
	
	public SaleManager(Campaing campaing) {
		this.campaing = campaing;
	}
	
	@Override
	public void sale(Game game, Gamer gamer, Campaing campaing) {
		
		double kampanyaliFiyat = game.getUnitPrice() - (game.getUnitPrice()*campaing.getDiscount()/100);
		System.out.println(gamer.getFirtsName() + " adlý oyuncuya " + game.getGameName() + " oyunu " + game.getUnitPrice() + 
				" tl. " + campaing.getCampaingName() + " kampanyasý ile " + kampanyaliFiyat + " tl ye satýldý.");
	}

}
