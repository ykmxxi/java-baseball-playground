package domain;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private final List<Baseball> baseballs;

	public Player() {
		this.baseballs = new ArrayList<>();
	}

	public void addBaseball(String input) {
		this.baseballs.add(new Baseball(input));
	}

	public List<Baseball> getBaseballs() {
		return baseballs;
	}

}
