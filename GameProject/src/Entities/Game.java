package Entities;

import Abstract.Entity;

public class Game implements Entity {

	int id;
	String gameName;
	double price;
	int stockAmount;
	Game[] games;

	public Game(int id, String gameName, double price, int stockAmount) {
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}