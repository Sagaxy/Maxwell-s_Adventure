package game.character;

import game.town.TownModel;

public class Player {

	public int coin;
	public int gemPower;
	public int gemPowerThreshold;
	public TownModel currentTown;
	
	Player maxwewll
	
	
	public Player(TownModel currentTown) {
		super();
		this.coin = 3;
		this.gemPower = 0;
		this.gemPowerThreshold = 7;
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
