package controller;

import domain.GameStatus;
import service.GameService;
import view.InputView;
import view.OutputView;

public class GameController {

	private final InputView inputView;
	private GameService gameService;

	public GameController() {
		this.inputView = new InputView();
		this.gameService = new GameService();
	}

	public void run() {
		playGame();

		retryOrEnd();
	}

	private void playGame() {
		GameStatus currentStatus;
		do {
			receiveInput();
			currentStatus = gameService.play();
			gameService.printGameStatus(currentStatus);
		} while (!gameService.isEndedGame(currentStatus));
	}

	private void receiveInput() {
		OutputView.printInputGuide();
		String input = inputView.readNumbers();
		gameService.addPlayerNumbersInput(input);
	}

	private void retryOrEnd() {
		OutputView.printEndGuide();
		String input = inputView.readRetryNumber();
		if (gameService.isReplaying(input)) {
			gameService = new GameService();
			run();
		}
	}

}
