package game.method;

import game.character.Player;

public class Method {
	
	public void Start() {
		Player Maxwell = new Player(3,0,7,true,Ubud);
	}
	
public void gemPowerCheck(Player Maxwell) {
		
		if(Maxwell.getGemPower()<0) {
			Maxwell.setGemPower(0);
			
		}
		else if(Maxwell.getGemPower()>Maxwell.getGemPowerThreshold()) {
			Maxwell.setLifeStatus(false);
		}
	}
public void Travel(Player Maxwell) {
	
	if(Maxwell.getCoin()>=1) {
		
	}
	else {
		Maxwell.setLifeStatus(false);
		System.out.println("YOU DIED by do not have any coin");
	}
}

}
