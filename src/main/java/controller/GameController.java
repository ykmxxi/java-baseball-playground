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

}
