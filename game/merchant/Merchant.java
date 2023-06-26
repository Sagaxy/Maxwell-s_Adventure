package game.merchant;

import java.util.List;
import java.util.Scanner;

import game.character.Player;
import game.town.Edge;
import game.town.TownModel;

public class Merchant {

	Scanner sc = new Scanner(System.in);

	public void manyCoins(Player maxwell) {
		System.out.println("\n\nMerchant:");
		System.out.println("Oi mate, how many coins you got?");
		System.out.println("**checking your bag coins**");
		int coins = maxwell.getCoin();
		System.out.println("Oh, so, you got " + coins+"\n");
	}

	public TownModel whereFromGo(Player maxwell) {
		System.out.println("where do you come from? ");
		String comeFrom = maxwell.getCurrentTown().getName();
		System.out.println("You:" + comeFrom);
		System.out.println("hmm..." + comeFrom + ", interesting.");
		System.out.println("And where are you going? ");

		List<Edge> options = maxwell.getCurrentTown().neighboringTowns;

		for (int i = 0; i < options.size(); i++) {
			Edge option = options.get(i);
			System.out.println((i + 1) + " . Town " + option.getDestiny().getName());
		}

		int chosenoption = sc.nextInt();
		if (chosenoption < 1 || chosenoption > options.size()) {
			System.out.println("INVALID CHOICE");
			whereFromGo(maxwell);
		}

		System.out.println(options.get(chosenoption - 1) + "? Huh, sure, got it, good trip to you mate!\n");

		return options.get(chosenoption).getDestiny();
	}

	public void coinToThreshold(Player maxwell, TownModel goingtown) {
		System.out.println("You want to exchange your coins for threshold in the jewel ?(Y/N)");

		String trade = sc.next();
		trade.toUpperCase();

		if (trade.equals("yes")) {
			trade = "Y";
		} else if (trade.equals("not")) {
			trade = "N";
		} else {
			System.out.println("Huh?! I think you don't understand it! I'll say it again.\n");
			coinToThreshold(maxwell, goingtown);
		}

		if (maxwell.getCoin() < 5 & (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) < 3) {
			if (trade.equals("Y")) {
				// resposta 1
				// perde 1 moeda ganha 1 limiar na joia
				maxwell.setCoin(maxwell.getCoin() + 1);
				maxwell.setGemPower(maxwell.getGemPowerThreshold() + 1);
			} else {
				// resposta 2
				// perde 1 moeda
				maxwell.setCoin(maxwell.getCoin() - 1);
			}
		} else if (maxwell.getCoin() < 5
				& (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) >= 3) {
			if (trade.equals("Y")) {
				// resposta 3
				// perde 3 moeda e ganha 2 de limiar na joia
				maxwell.setCoin(maxwell.getCoin() - 1);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 2);
			} else {
				// resposta 4
				// perde 2 moeda
				maxwell.setCoin(maxwell.getCoin() - 2);
			}
		} else if (maxwell.getCoin() >= 5
				& (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) < 3) {
			if (trade.equals("Y")) {
				// resposta 5
				maxwell.setCoin(maxwell.getCoin() - 3);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 2);
			} else {
				// resposta 6
				maxwell.setCoin(maxwell.getCoin() - 2);
			}
		} else if (maxwell.getCoin() >= 5
				& (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) >= 3) {
			if (trade.equals("Y")) {
				maxwell.setCoin(maxwell.getCoin() - 1);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 3);
			} else {
				maxwell.setCoin(maxwell.getCoin() - 3);
			}
		}

	}
}