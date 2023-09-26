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

	public String getCurrentStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		if (isNothing()) {
			return "낫싱";
		}
		if (ball != 0) {
			stringBuilder.append(ball).append("볼 ");
		}
		if (strike != 0) {
			stringBuilder.append(strike).append("스트라이크");
		}
		return stringBuilder.toString().trim();
	}

}
