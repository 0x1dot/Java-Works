package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Campaign implements Entity {

	int id;
	String campaignName;
	LocalDate campaignDate;
	int discount;

	public Campaign(int id, String campaignName, LocalDate campaignDate, int discount) {
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDate = campaignDate;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public LocalDate getCampaignDate() {
		return campaignDate;
	}

	public void setCampaignDate(LocalDate campaignDate) {
		this.campaignDate = campaignDate;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}