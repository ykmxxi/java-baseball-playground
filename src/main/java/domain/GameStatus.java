package domain;

public class GameStatus {

	private int strike;
	private int ball;

	public GameStatus() {
		this.strike = 0;
		this.ball = 0;
	}

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}

	public void addStrike() {
		this.strike += 1;
	}

	public void addBall() {
		this.ball += 1;
	}

	public boolean isNothing() {
		return strike == 0 && ball == 0;
	}

	public boolean isEnd() {
		return strike == 3;
	}

}
