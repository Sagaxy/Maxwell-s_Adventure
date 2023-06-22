package game.method;

import game.character.Player;
import game.town.*;

public class Method {
	
	public void gemPowerCheck(Player maxwell) {

		if (maxwell.getGemPower() < 0) {
			maxwell.setGemPower(0);

		} else if (maxwell.getGemPower() > maxwell.getGemPowerThreshold()) {
			System.out.println("Your gem increased to mutch power, you can't travel anymore. ");
			//metodo para quebrar o codigo
		}
	}

	public void Travel(Player maxwell) {

		if (maxwell.getCoin() >= 1) {
			maxwell.getCurrentTown();
			

		}
		else {
			System.out.println("You have no coins, you can't continue your journey. ");
			
			
			
		}
	}

}
