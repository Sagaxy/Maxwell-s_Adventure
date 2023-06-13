package game.character;

import game.town.TownModel;

public class Player {

	private int coin;
	private int gemPower;
	private int gemPowerThreshold;
	private TownModel currentTown;

	
	public Player(int coin, int gemPower, int gemPowerThreshold, TownModel currentTown) {
		super();
		this.coin = coin;
		this.gemPower = gemPower;
		this.gemPowerThreshold = gemPowerThreshold;
		this.currentTown = currentTown;
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
