package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " isimli oyun sisteme eklendi. Oyunun indirimsiz fiyatı " + "₺"
				+ game.getPrice() + " olarak belirlendi. Oyunun stokdaki adedi : " + game.getStockAmount());
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyunlar güncellendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println("Sistemdeki oyunlar silindi.");
	}

	@Override
	public void getAll(Game[] games) {
		for (Game game : games) {
			System.out.println("Sistemdeki oyunlar :" + game.getGameName());
		}

	}

}