package game.character;

import game.town.TownModel;

public class Player {

	private static Player maxwell;
	private int coin;
	private int gemPower;
	private int gemPowerThreshold;
	private TownModel currentTown;

	private Player(TownModel currentTown) {
		super();
		this.coin = 3;
		this.gemPower = 0;
		this.gemPowerThreshold = 7;
		this.currentTown = currentTown;
	}

	public static Player getMaxwel(TownModel currentTown) {
		if (maxwell == null) {
			maxwell = new Player(currentTown);
		}
		return maxwell;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getGemPower() {
		return gemPower;
	}

	public void setGemPower(int gemPower) {
		this.gemPower = gemPower;
	}

	public int getGemPowerThreshold() {
		return gemPowerThreshold;
	}

	public void setGemPowerThreshold(int gemPowerThreshold) {
		this.gemPowerThreshold = gemPowerThreshold;

	}

	public TownModel getCurrentTown() {
		return currentTown;
	}

	public void setCurrentTown(TownModel currentTown) {
		this.currentTown = currentTown;
	}
}
