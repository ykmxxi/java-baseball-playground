package view;

import domain.GameStatus;

public class OutputView {

	private static final String INPUT_GUIDE = "숫자를 입력해 주세요 : ";
	private static final String END_GUIDE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
	private static final String RETRY_GUIDE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";

	public static void printInputGuide() {
		System.out.println(INPUT_GUIDE);
	}

	public static void printEndGuide() {
		System.out.println(END_GUIDE);
		System.out.println(RETRY_GUIDE);
	}

	public static void printGameStatus(GameStatus gameStatus) {
		System.out.println(gameStatus.getCurrentStatus());
	}

}
