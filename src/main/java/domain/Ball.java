package domain;

public class Ball {

	private final int number;
	private final int position;

	public Ball(int number, int position) {
		this.number = number;
		this.position = position;
	}

	public boolean isSameNumber(int number) {
		return this.number == number;
	}

}
