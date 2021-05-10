package oyunProjesi;

import Adapters.MernisServis;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1, "Bircan", "ÇÝFTÇÝ", "41615116342", 1998);
		
		Game game = new Game(1, "League of Legens", 2659, 30);
		
		Campaing campaing = new Campaing(1, "Yeni sezon indirimi", 25);
		
		//double kampanyaliFiyat = game.getUnitPrice() - (game.getUnitPrice()*campaing.getDiscount()/100);
		//System.out.println(kampanyaliFiyat);
		
		GamerManager gamerManager = new GamerManager(new MernisServis());
		gamerManager.add(gamer);
		
		SaleManager saleManager = new SaleManager(campaing);
		saleManager.sale(game, gamer, campaing);

	}

}
