package game.mission;

import java.util.Scanner;
import game.character.Player;
import game.town.TownModel;

public class Mission {
	Scanner sc = new Scanner(System.in);

	public String acceptMission() {

		System.out.println("Do you accept the quest of this Town?(Y/N) ");
		String answer = sc.next();
		answer.toUpperCase();

		if (answer.equals("yes")) {
			answer = "Y";
		} else if (answer.equals("not")) {
			answer = "N";
		} else {
			System.out.println("INVALID ANSWER!! ");
			acceptMission();
		}
		return answer;
	}

	public void questKOKalb(String answerMission, Player maxwell) {

		if (answerMission.equals("Y")) {
			maxwell.setCoin(maxwell.getCoin() + 4);
			maxwell.setQuestKingdonOfKalb(true);
			System.out.println("you earned 4 coins!");
			System.out.println("Go to the Town of Grand Duchy of Smalia and receive the Gauntlets of power. ");

		}
	}

	public void quesDefalsia(String answermission, Player maxwell) {

		if (answermission.equals("Y")) {
			maxwell.setCoin(maxwell.getCoin() + 6);
			maxwell.setQuestDefalsia(true);
			System.out.println("Go to the Town of Principality of Kasya and receive the boots of power. ");

		}
	}

	public void questVuneseEmpire(String answermission, Player maxwell) {

		if (answermission.equals("Y")) {
			maxwell.setCoin(maxwell.getCoin() + 1);
			maxwell.setQuestVuneseEmpire(true);
			System.out.println("Go to the Town Ubud and get the Glory of the Returnees");

		}
	}

	public void questAcept(Player maxwell, TownModel town) {

		if (maxwell.isQuestKingdonOfKalb()) {
			if (maxwell.getCurrentTown().getName().equals("Grand Duchy of Smalia")) {
				maxwell.setCoin(maxwell.getCoin() + 2);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 2);
				System.out.println("you finished the Kingdon of kalb quest!");
				System.out.println("you earned the Gauntlets of power, 2 coins and 2 pts Power Threshold of the Gem!");
			}
		}
		if (maxwell.isQuestDefalsia()) {
			if (maxwell.getCurrentTown().getName().equals("Principality of Kasya")) {
				maxwell.setCoin(maxwell.getCoin() + 3);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 1);
				System.out.println("you finished the Defalsia quest!");
				System.out.println("you earned the boots of power, 3 coins and 1 pts Power Threshold of the Gem!");

				/*
				 * chegando em Principality of Kasya, completando a missão // coin + 3 // Power
				 * Threshold + 1
				 */
			}
		}
		if (maxwell.isQuestVuneseEmpire()) {
			if (maxwell.getCurrentTown().getName().equals("Ubud")) {
				maxwell.setCoin(maxwell.getCoin() + 10);
				maxwell.setCoin(maxwell.getCoin() - 4);
				System.out.println("you finished the Vunese Empire quest!");
				System.out.println(
						"you earned the Glory of the Returnees, 10 coins and -4 pts Power Threshold of the Gem!");
			}

		}
	}
}
