package view;

public class OutputView {

	private static final String PLAYER_NUMBER_INPUT_GUIDE = "숫자를 입력해 주세요 : ";
	private static final String GAME_END_GUIDE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	private static final String GAME_RETRY_GUIDE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

	public static void printPlayerNumberInputGuide() {
		System.out.print(PLAYER_NUMBER_INPUT_GUIDE);
	}

	public static void printGameResult(String gameResult) {
		System.out.println(gameResult);
	}

	public static void printGameEndGuide() {
		System.out.println(GAME_END_GUIDE);
		System.out.println(GAME_RETRY_GUIDE);
	}

}
