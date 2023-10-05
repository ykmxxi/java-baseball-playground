package domain;

public enum GameResult {
	BALL("볼"), STRIKE("스트라이크"), NOTHING("낫싱");

	private final String message;

	GameResult(String message) {
		this.message = message;
	}

	public static String getGameResultMessage(int strikeCount, int ballCount) {
		if (strikeCount == 0 && ballCount == 0) {
			return NOTHING.message;
		}
		return createResultMessage(strikeCount, ballCount);
	}

	private static String createResultMessage(int strikeCount, int ballCount) {
		StringBuilder builder = new StringBuilder();
		if (ballCount != 0) {
			builder.append(ballCount).append(BALL.message);
		}
		if (strikeCount != 0) {
			addWhiteSpace(ballCount, builder);
			builder.append(strikeCount).append(STRIKE.message);
		}
		return builder.toString();
	}

	private static void addWhiteSpace(int ballCount, StringBuilder builder) {
		if (ballCount != 0) {
			builder.append(' ');
		}
	}

}
