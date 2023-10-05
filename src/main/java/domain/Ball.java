package domain;

import java.util.Objects;

public class Ball {

	private final int number;
	private final int position;

	public Ball(int number, int position) {
		this.number = number;
		this.position = position;
	}

	public int getNumber() {
		return number;
	}

	public int getPosition() {
		return position;
	}

	public boolean isSameNumber(int number) {
		return this.number == number;
	}

	public boolean isSamePosition(int position) {
		return this.position == position;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null || getClass() != other.getClass()) {
			return false;
		}
		Ball ball = (Ball)other;
		return number == ball.number && position == ball.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, position);
	}

}
