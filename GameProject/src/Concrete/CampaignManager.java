package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void addData(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " isimli kampanya sisteme eklendi. \n" + "Başlangıç tarihi : "
				+ campaign.getCampaignDate() + "\n" + "indirim oranı    : %" + campaign.getDiscount() + "\n");
	}

	@Override
	public void updateData(Campaign campaign) {
		System.out.println("Bilgiler g�ncellendi : " + campaign.getCampaignName());
	}

	@Override
	public void deleteData(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName() + " " + campaign.getCampaignDate() + " "
				+ campaign.getDiscount());
	}

}