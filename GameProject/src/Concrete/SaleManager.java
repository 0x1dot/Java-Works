package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Sale;
import Entities.User;

public class SaleManager implements SaleService {
	@Override
	public void sale(User user, Game game, Campaign campaign, Sale sale) {
		double priceWithDiscount = campaign.getDiscount() * (game.getPrice() / 100);
		System.out.println("Kullanıcı             :" + user.getFirstName() + " " + user.getLastName());
		System.out.println("Satın alınan ürün     :" + game.getGameName());
		System.out.println("Yararlanılan kampanya :" + campaign.getCampaignName());
		System.out.println("Ödeme yöntemi         :" + sale.getSaleType());
		System.out.println("Satın alım tarihi     :" + sale.getSaleDate());
		System.out.println("Ürün fiyatı           :₺" + game.getPrice());
		System.out.println("İndirim oranı         :%" + campaign.getDiscount());
		System.out.println("İndirimli ürün fiyatı :₺" + priceWithDiscount);

	}
}