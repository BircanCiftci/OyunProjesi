package Abstract;

import Entities.Campaing;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer, Campaing campaing);
}
