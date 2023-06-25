package game.mission;

import java.util.Scanner;
import game.character.Player;

public class Mission {
	Scanner sc = new Scanner(System.in);

	public String acceptMission() {
		
		System.out.println("Do you accept this mission ?(Y/N) ");
		String answer = sc.next();
        answer.toUpperCase();
        
        if(answer.equals("yes")) {
        	answer = "Y";
        }
        else if(answer.equals("not")) {
        	answer = "N";
        }
        else {
        	System.out.println("INVALID ANSWER!! ");
        	acceptMission();
        }
        return answer;
	}
	
	public questKOKalb(String answerMission, Player maxwell) {
	
		if(answerMission.equals("Y")) {
			maxwell.setCoin(maxwell.getCoin() + 4);
			maxwell.setQuestKingdonOfKalb(true);
			System.out.println("ypu earned 4 coins!");
			System.out.println("Go to the city of Grand Duchy of Smalia and receive the gloves of power ");

		}
	}
	public questAcept()
}
	/*
		// Missão de Kingdom of Kalb
		if (acceptMission().equals("Y")) {
			maxwell.getCoin();
			
			// chegando em Grand Duchy, completando a missão
			// coin + 2
			// Power Threshold + 2
		}
		else {
			System.out.println("OK! Have a good trip ");
		}
		
		// Missão de Defalsia
		if (sc.next().equals("yes")) {
			int newCoin = Player.coin + 6;
			Player.setCoin(newCoin);
			System.out.println("Go to the city of Principality of Kasya and receive the boots of power ");

			// chegando em Principality of Kasya, completando a missão
			// coin + 3
			// Power Threshold + 1
		} 
		else {
			System.out.println("OK! Have a good trip ");
		}
		
		// Missão de Venuse Empire
		if (sc.next().equals("yes")) {
			Player.setCoin(Player.getCoin() + 2);
			System.out.println("Go to Ubud and receive the Glory of the Returnees ");

			// chegando em Ubud, completando a missão
			// coin + 10
			// Power Threshold - 4
		} 
		else {
			System.out.println("OK! Have a good trip ");
		}

	
}
