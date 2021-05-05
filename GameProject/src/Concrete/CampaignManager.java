package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addData(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya sisteme eklendi. \n" + "Baþlangýç tarihi : "
				+ campaign.getCampaignDate() + "\n" + "Ýndirim oraný    : %" + campaign.getDiscount() + "\n");
	}

	@Override
	public void updateData(Campaign campaign) {
		System.out.println("Bilgiler güncellendi : " + campaign.getCampaignName());
	}

	@Override
	public void deleteData(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName() + " " + campaign.getCampaignDate() + " "
				+ campaign.getDiscount());
	}

}