package domain;

import java.util.ArrayList;
import java.util.List;

public class Referee {

	private GameStatus gameStatus;
	private List<String> computerNumbers;
	private List<String> playerNumbers;

	public Referee() {
		computerNumbers = new ArrayList<>();
		playerNumbers = new ArrayList<>();
	}

	public GameStatus judge(Baseball computer, Baseball player) {
		gameStatus = new GameStatus();
		computerNumbers = computer.getNumbers();
		playerNumbers = player.getNumbers();

		compare();

		return gameStatus;
	}

	private void compare() {
		for (int i = 0; i < computerNumbers.size(); i++) {
			compare(i);
		}
	}

	private void compare(int i) {
		for (int j = 0; j < playerNumbers.size(); j++) {
			if (isStrike(i, j)) {
				gameStatus.addStrike();
			}
			if (isBall(i, j)) {
				gameStatus.addBall();
			}
		}
	}

	private boolean isStrike(int computerIdx, int playerIdx) {
		return computerNumbers.get(computerIdx).equals(playerNumbers.get(playerIdx)) && computerIdx == playerIdx;
	}

	private boolean isBall(int computerIdx, int playerIdx) {
		return computerNumbers.get(computerIdx).equals(playerNumbers.get(playerIdx)) && computerIdx != playerIdx;
	}

}
