package game.method;

import java.util.List; 
import java.util.Scanner;
import game.character.Player;
import game.town.Edge;
import game.town.TownModel;

public class Method {

	public void gemPowerCheck(Player maxwell) {

		if (maxwell.getGemPower() < 0) {
			maxwell.setGemPower(0);

		} else if (maxwell.getGemPower() > maxwell.getGemPowerThreshold()) {
			System.out.println("Your gem increased to mutch power, you can't travel anymore. ");
			// metodo para quebrar o codigo
		}
	}

	public void travel(Player maxwell) {

		if (maxwell.getCoin() >= 1) {
			TownModel ctown = maxwell.getCurrentTown();
			
			System.out.println("you're in " + maxwell.getCurrentTown());
            System.out.println("your coins in the bag: " + maxwell.getCoin());
            
            List<Edge> neighbohood = ctown.neighboringTowns;
            
            System.out.println("Which one of that you wnat to go? ");
            
            for(int i = 0; i < neighbohood.size(); i++) {
            	Edge edge = neighbohood.get(i);
            	System.out.println((i+1) + ". Town" + edge.getDestiny().getName());
            }
            
            //take the player choice
            
            try (Scanner sc = new Scanner(System.in)) {
				int choice = sc.nextInt();
				
				if(choice < 1 || choice > neighbohood.size()) {
					System.out.println("INVALID CHOICE");
					travel(maxwell);
				}
				
				Edge chosenTown = neighbohood.get(choice - 1);
				
				
				//modify the current town to the chosen one
				//sum the gem power with the power of the town
				maxwell.setCurrentTown(chosenTown.getDestiny());
				
				maxwell.setGemPower(maxwell.getGemPower() + chosenTown.getDestiny().getPowerQuantity());
			}
            catch (Exception e) {
				// TODO: handle exception
            	System.out.println("WHRITE A INTEGER ANSWER");
				travel(maxwell);
			}
		}
		else {
			System.out.println("You DIED FROM POBREZA AGUDA");
			//metodo para quebrar o codigo
		}
		
	}
}
          