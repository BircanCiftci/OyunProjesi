package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Adapters.MernisServis;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	MernisServis mernisServis;
	
	public GamerManager(MernisServis mernisServis) {
		this.mernisServis = mernisServis;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(this.mernisServis.CheckIfRealPerson(gamer)) {
			System.out.println("M��teri eklendi : " + gamer.getFirtsName() + " " + gamer.getLastName());
		}else {
			System.out.println("M��teri eklenmedi!");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirtsName() + "oyuncusu g�ncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirtsName() + "oyuncusu silindi");
		
	}
	
}
