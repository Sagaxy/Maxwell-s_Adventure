package game.merchant;

import java.util.Scanner;
import game.character.Player;

public class Merchant {

        Scanner sc = new Scanner(System.in);
        
        
        
        public void manyCoins(Player maxwell) {
        	System.out.println("Oi mate, how many coins you got?");
        	System.out.println("**checking your bag coins**");
        	int coins = maxwell.getCoin();
        	System.out.println("Oh, so, you got " + coins);
        }
        	
        
        public void whereFromGo() {
	        System.out.println("where do you come from? ");
	        String comeFrom = sc.nextLine();
	        
	        System.out.println("hmm..." + comeFrom +", interesting.");
	        System.out.println("And where are you going? ");
	        
	        String going = sc.nextLine();
	        
	        System.out.println(going + "? Huh, sure, got it, good trip to you mate!");
        }
	    
        
        public void coinToThreshold(Player maxwell) {
	        System.out.println("You want to exchange your coins for threshold in the jewel ?(Y/N)");
        
	        String trade = sc.next();
	        trade.toUpperCase();
	        
	        
	        if(trade.equals("yes")) {
	        	trade = "Y";
	        }
	        else if(trade.equals("not")) {
	        	trade = "N";
	        }
	        else {
	        	System.out.println("Huh?! I think you don't understand it! I'll say it again.");
	        	coinToThreshold(maxwell);	        	
	        }
	        
	        
	        if(maxwell.getCoin()<5) {
	        	if(trade.equals("Y")) {
	        		//perde 1 moeda ganha 1 limiar na joia
	        		maxwell.setCoin(maxwell.getCoin()+1);
	        		maxwell.setGemPower(maxwell.getGemPowerThreshold()+1);
	        	}
	        	else {
	        		//perde 1 moeda
	        		maxwell.setCoin(maxwell.getCoin()-1);
	        	}
	        }	
	        else {
	        	if(trade.equals("Y")) {
	        		//perde 3 moeda e ganha 2 de limiar na joia
	        		maxwell.setCoin(maxwell.getCoin()-3);
	        		maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold()+2);
	        	}
	        	else {
	        		//perde 2 moeda	        		
	        		maxwell.setCoin(maxwell.getCoin()-2);
	        	}
	        
	        }
	        
        }
}