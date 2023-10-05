package domain;

public class Referee {

	private int strikeCount;
	private int ballCount;

	public Referee() {
		strikeCount = 0;
		ballCount = 0;
	}

	public int getStrikeCount() {
		return strikeCount;
	}

	public int getBallCount() {
		return ballCount;
	}

	public void compare(Ball computerBall, Ball playerBall) {
		if (isStrike(computerBall, playerBall)) {
			strikeCount++;
		}
		if (isBall(computerBall, playerBall)) {
			ballCount++;
		}
	}

	private boolean isStrike(Ball computerBall, Ball playerBall) {
		return computerBall.equals(playerBall);
	}

	private boolean isBall(Ball computerBall, Ball playerBall) {
		return computerBall.isSameNumber(playerBall.getNumber())
			&& !computerBall.isSamePosition(playerBall.getPosition());
	}

}
