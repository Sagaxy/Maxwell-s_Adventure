package game.method;

import game.character.Player;
import game.town.*;

public class Method {
	
	protected Player Maxwell = new Player(3, 0, 7, false, );
	
	public void gemPowerCheck(Player Maxwell) {

		if (Maxwell.getGemPower() < 0) {
			Maxwell.setGemPower(0);

		} else if (Maxwell.getGemPower() > Maxwell.getGemPowerThreshold()) {
			//metodo de recursao para morrer;
		}
	}

	public void Travel(Player Maxwell) {

		if (Maxwell.getCoin() >= 1) {

		} else {
			
		}
	}

}
