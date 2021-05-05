package Entities;

import java.time.LocalDate;

import Abstract.Entity;
import Concrete.CampaignManager;

public class Sale implements Entity {
	CampaignManager campaignManager;
	Campaign campaign;
	Game game;
	int id;
	String saleType;
	LocalDate saleDate;

	public Sale(int id, String saleType, LocalDate saleDate) {
		this.id = id;
		this.saleType = saleType;
		this.saleDate = saleDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSaleType() {
		return saleType;
	}

	public void setSaleType(String saleType) {
		this.saleType = saleType;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

}