package service;

import domain.Computer;
import domain.GameStatus;
import domain.Player;
import domain.Referee;

public class GameService {

	private final Computer computer;
	private final Player player;
	private final Referee referee;

	public GameService() {
		this.computer = new Computer();
		this.player = new Player();
		this.referee = new Referee();
	}

	public void addPlayerNumbersInput(String input) {
		player.addBaseball(input);
	}

	public boolean isEndedGame(GameStatus gameStatus) {
		return gameStatus.isEnd();
	}

	public GameStatus play() {
		return referee.judge(computer.getBaseball(), player.getBaseballs().get(player.getBaseballs().size()));

	}

	public boolean isReplaying(String input) {
		return input.equals("1");
	}

}
