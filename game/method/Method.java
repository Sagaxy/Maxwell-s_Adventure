package game.method;

import game.character.Player;

public class Method {
	
	public void Start() {
		Player Maxwell = new Player(3,0,7,true);
	}
	
public void gemPowerCheck(Player Maxwell) {
		
		if(Maxwell.getGemPower()<0) {
			Maxwell.setGemPower(0);
			
		}
		else if(Maxwell.getGemPower()>Maxwell.getGemPowerThreshold()) {
			Maxwell.setLifeStatus(false);
		}
	}

}
