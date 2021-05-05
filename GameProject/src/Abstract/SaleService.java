package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public interface SaleService {
	void sale(User user, Game game, Campaign campaign, Sale sale);
}
