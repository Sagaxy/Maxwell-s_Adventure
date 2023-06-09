package game.character;

import game.town.TownModel;

public class Player {

	private int coin;
	private int gemPower;
	private int gemPowerThreshold;
	private TownModel currentTown;
	private boolean questKingdomOfKalb;
	private boolean questDefalsia;
	private boolean questVuneseEmpire;

	public Player(TownModel currentTown) {
		super();
		this.coin = 3;
		this.gemPower = 0;
		this.gemPowerThreshold = 7;
		this.currentTown = currentTown;
		this.questKingdomOfKalb = false;
		this.questDefalsia = false;
		this.questVuneseEmpire = false;
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

	public boolean isQuestKingdomOfKalb() {
		return questKingdomOfKalb;
	}

	public void setQuestKingdomOfKalb(boolean questKingdomOfKalb) {
		this.questKingdomOfKalb = questKingdomOfKalb;
	}

	public boolean isQuestDefalsia() {
		return questDefalsia;
	}

	public void setQuestDefalsia(boolean questDefalsia) {
		this.questDefalsia = questDefalsia;
	}

	public boolean isQuestVuneseEmpire() {
		return questVuneseEmpire;
	}

	public void setQuestVuneseEmpire(boolean questVuneseEmpire) {
		this.questVuneseEmpire = questVuneseEmpire;
	}

	public void atributtes() {
		System.out.println("\n\n\t\t[YOUR STATUS]\n---------------------------------"
				+ "----------------\n\n[currentTown]= (" + currentTown.getName() + ")"
				+ "\n[gemPowerThreshold] = (" + gemPowerThreshold + ") \n[coin] = (" + coin + ")\n[gemPower] = (" + gemPower
				+ ")\n\n-------------------------------------------------");
	}

}
