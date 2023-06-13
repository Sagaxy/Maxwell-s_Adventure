package game.gameapp;

import game.town.TownModel;

public class MaxwellsAdventure {

	public static void main(String[] args) {
		
		TownModel ubud = new TownModel("Ubud", 0);
		TownModel kingdonOfLegmod= new TownModel("Kingdon of Legmod", 2);
		TownModel principalityOfNekikh= new TownModel("Principality of Nekikh", 1);
		TownModel pricipalityOfGritesthr = new TownModel("Pricipality of Gritesthr", 5);
		TownModel protetoradeOfDrogove = new TownModel("Protectorate of Drogove", 3);
		TownModel kingdomOfLastwatch= new TownModel("Kindgom of Lastwatch", -2);
		TownModel grandduchyOfSmalia = new TownModel("Grand Duchy of Smalia", 1);
		TownModel kingdomOfOldcalia = new TownModel("Kingdom of OldCalia", 4);
		TownModel kingdomOfKalb = new TownModel("Kingdom of Kalb", 2); 
		TownModel aymarLeague = new TownModel("Aymar League", 1); 
		TownModel defalsia = new TownModel("Defalsia", -3); 
		TownModel vuneseOfEmpire = new TownModel("Vunese of Empire", 0);
		TownModel principalityOfKarhora = new TownModel("Principality of Karhora", -2);
		TownModel chandirSultanate = new TownModel("Chandir Sultanate ", 1);
		TownModel bun = new TownModel("Bun", 5);
		TownModel principalityOfKasya = new	TownModel("Principality of Kasya", -7);
		
		ubud.addEdge(kingdonOfLegmod, 2);
		ubud.addEdge(principalityOfNekikh, 1);
		
		kingdonOfLegmod.addEdge(kingdomOfOldcalia, 4);
	}

}
