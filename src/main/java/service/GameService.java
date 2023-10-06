package service;

import domain.Computer;
import domain.Player;

public class GameService {

	private final Computer computer;
	private final Player player;

	public GameService() {
		this.computer = new Computer();
		this.player = new Player();
	}

	public void startGame(String playerNumber) {
		player.changeNumbers(playerNumber);
	}

}
