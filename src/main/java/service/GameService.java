package service;

import java.util.List;

import domain.Ball;
import domain.Computer;
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

	public void startGame(String playerNumber) {
		player.changeNumbers(playerNumber);
	}

	public String judgment() {
		List<Ball> computerBalls = computer.getNumbers();
		List<Ball> playerBalls = player.getNumbers();
		for (Ball computerBall : computerBalls) {
			compare(playerBalls, computerBall);
		}
		return referee.notifyJudgmentResult();
	}

	private void compare(List<Ball> playerBalls, Ball computerBall) {
		for (Ball playerBall : playerBalls) {
			referee.compare(computerBall, playerBall);
		}
	}

	public boolean isEnded() {
		return referee.isGameEnded();
	}

}
