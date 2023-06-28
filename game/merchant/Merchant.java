package game.merchant;

import java.util.List;
import java.util.Scanner;

import game.character.Player;
import game.town.Edge;
import game.town.TownModel;

public class Merchant {

	Scanner sc = new Scanner(System.in);

	public void manyCoins(Player maxwell) {
		System.out.println("\nMerchant of " + maxwell.getCurrentTown().getName() + ":Oi mate, how many coins you got?");
		System.out.println("**checking your bag coins**");
		int coins = maxwell.getCoin();
		System.out.println("Oh, so, you got " + coins + "...\n1");
	}

	public TownModel whereFromGo(Player maxwell) {
		List<Edge> options = maxwell.getCurrentTown().neighboringTowns;

		System.out.println(">> so, where do you come from? \n");
		for (int i = 0; i < options.size(); i++) {
			Edge option = options.get(i);
			System.out.println("{{" + (i + 1) + "}}" + " . Town " + option.getDestiny().getName() + " ["
					+ option.getDestiny().getPowerQuantity() + " of power]");
		}
		try {

			int answer = sc.nextInt();
			if (answer < 1 || answer > options.size()) {

				System.out.println("\nYou:" + options.get(answer).getDestiny().getName());
				System.out.println("\nMercahnt of " + maxwell.getCurrentTown().getName() + ":\nhmm..."
						+ options.get(answer - 1).getDestiny().getName() + ", interesting.");
			} else {
				System.out.println("INVALID ANSWER");
				whereFromGo(maxwell);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("WHRITE A INTEGER ANSWER");
			whereFromGo(maxwell);

		}

		System.out.println(">> And where are you going? \n");

		for (int i = 0; i < options.size(); i++) {
			Edge option = options.get(i);
			System.out.println("{{" + (i + 1) + "}}" + " . Town " + option.getDestiny().getName() + " ["
					+ option.getDestiny().getPowerQuantity() + " of power]");
		}

		int chosenoption = sc.nextInt();
		if (chosenoption < 1 || chosenoption > options.size()) {
			System.out.println("INVALID CHOICE");
			whereFromGo(maxwell);
		}
		System.out.println(
				options.get(chosenoption - 1).getDestiny().getName() + "? Huh, sure, got it, good trip to you mate!\n");

		return options.get(chosenoption - 1).getDestiny();
	}

	//
	public void coinToThreshold(Player maxwell, TownModel goingtown) {
		System.out.println("You want to exchange your coins for threshold in the jewel ?(Y/N)");

		String trade = sc.next();

		if (trade.equals("yes") || trade.equals("y") || trade.equals("YES") || trade.equals("Y")) {
			trade = "Y";
		} else if (trade.equals("not") || trade.equals("n") || trade.equals("NOT") || trade.equals("N")) {
			trade = "N";
		} else {
			System.out.println("Huh?! I think you don't understand it! I'll say it again.\n");
			coinToThreshold(maxwell, goingtown);
		}

		if (maxwell.getCoin() < 5 & (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) < 3) {
			if (trade.equals("Y")) {
				maxwell.setCoin(maxwell.getCoin() + 1);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 1);
			} else {
				maxwell.setCoin(maxwell.getCoin() - 1);
			}
		} else if (maxwell.getCoin() < 5
				& (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) >= 3) {
			if (trade.equals("Y")) {
				maxwell.setCoin(maxwell.getCoin() - 1);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 2);
			} else {
				maxwell.setCoin(maxwell.getCoin() - 2);
			}
		} else if (maxwell.getCoin() >= 5
				& (maxwell.getCurrentTown().getPowerQuantity() - goingtown.getPowerQuantity()) < 3) {
			if (trade.equals("Y")) {
				maxwell.setCoin(maxwell.getCoin() - 3);
				maxwell.setGemPowerThreshold(maxwell.getGemPowerThreshold() + 2);
			} else {
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