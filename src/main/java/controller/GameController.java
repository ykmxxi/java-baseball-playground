package controller;

import service.GameService;
import view.InputView;
import view.OutputView;

public class GameController {

	private final InputView inputView;
	private final GameService gameService;

	public GameController() {
		this.inputView = new InputView();
		this.gameService = new GameService();

	}

	public void initGame() {
		OutputView.printPlayerNumberInputGuide();
		String playerNumber = inputView.readPlayerNumber();
		gameService.startGame(playerNumber);
	}

	public void proceedGame() {
		String judgmentResult = gameService.judgment();
		OutputView.printGameResult(judgmentResult);
		if (gameService.isEnded()) {
			OutputView.printGameEndGuide();
		}
		if (!gameService.isEnded()) {
			initGame();
			proceedGame();
		}
	}

}
