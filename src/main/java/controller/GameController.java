package controller;

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
		initGame();
		proceedGame();
		replayOrExit();
	}

	private void initGame() {
		OutputView.printPlayerNumberInputGuide();
		String playerNumber = inputView.readPlayerNumber();
		gameService.startGame(playerNumber);
	}

	private void proceedGame() {
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

	private void replayOrExit() {
		String replayNumber = inputView.readReplayNumber();
		if (gameService.isReplay(replayNumber)) {
			this.gameService = new GameService();
			run();
		}
	}

}
