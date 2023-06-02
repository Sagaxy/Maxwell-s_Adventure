package game.character;

import game.town.Town;

public class Player {

	int coin;
	int gemPower;
	int gemPowerThreshold;
	boolean lifeStatus;
	Town currentTown;

	public Player(int coin, int gemPower, int gemPowerThreshold, boolean lifeStatus,
			Town currentTown) {
		super();
		this.coin = coin;
		this.gemPower = gemPower;
		this.gemPowerThreshold = gemPowerThreshold;
		this.lifeStatus = lifeStatus;
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

	public boolean isLifeStatus() {
		return lifeStatus;
	}

	public void setLifeStatus(boolean lifeStatus) {
		this.lifeStatus = lifeStatus;
	}
	
	public Town getCurrentTown() {
		return currentTown;
	}

	public void setCurrentTown(Town currentTown) {
		this.currentTown = currentTown;
	}

}
