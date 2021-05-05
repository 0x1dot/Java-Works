import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class Main {
	public static void main(String[] args) {
		User user = new User(1, "Murat", "Dursun", "11111111111", 2000);
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.register(user);
		userManager.updateData(user);
		userManager.deleteData(user);

		System.out.println("-------------------------------------------------------");

		Campaign campaign = new Campaign(1, "Yaz sezonu indirimleri", LocalDate.now(), 50);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addData(campaign);
		campaignManager.updateData(campaign);
		campaignManager.deleteData(campaign);

		System.out.println("--------------------------------------------------------------------------");

		Game game1 = new Game(1, "Call of Duty", 70, 10000);
		Game game2 = new Game(2, "Left 4 Dead 2", 30, 5000);
		Game[] games = { game1, game2 };

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);
		gameManager.getAll(games);
		gameManager.delete(game1);

		System.out.println("--------------------------------------------------------------------------");

		Sale sale = new Sale(1, "Banka Kartı", LocalDate.now());
		SaleManager saleManager = new SaleManager();
		saleManager.sale(user, game2, campaign, sale);
	}
}