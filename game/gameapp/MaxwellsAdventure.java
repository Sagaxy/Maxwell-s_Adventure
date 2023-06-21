package game.gameapp;

import game.character.Player;
import game.town.TownModel;

public class MaxwellsAdventure {

	public static void main(String[] args) {
		
		TownModel ubud = new TownModel("Ubud", 0);
		TownModel kingdonOfLegmod = new TownModel("Kingdon of Legmod", 2);
		TownModel principalityOfNekikh = new TownModel("Principality of Nekikh", 1);
		TownModel principalityOfGritesthr = new TownModel("Pricipality of Gritesthr", 5);
		TownModel protetorateOfDrogove = new TownModel("Protectorate of Drogove", 3);
		TownModel kingdomOfLastwatch = new TownModel("Kindgom of Lastwatch", -2);
		TownModel grandduchyOfSmalia = new TownModel("Grand Duchy of Smalia", 1);
		TownModel kingdomOfOldcalia = new TownModel("Kingdom of OldCalia", 4);
		TownModel kingdomOfKalb = new TownModel("Kingdom of Kalb", 2);
		TownModel aymarLeague = new TownModel("Aymar League", 1);
		TownModel defalsia = new TownModel("Defalsia", -3);
		TownModel vuneseOfEmpire = new TownModel("Vunese of Empire", 0);
		TownModel principalityOfKarhora = new TownModel("Principality of Karhora", -2);
		TownModel chandirSultanate = new TownModel("Chandir Sultanate ", 1);
		TownModel bun = new TownModel("Bun", 5);
		TownModel principalityOfKasya = new TownModel("Principality of Kasya", -7);
		TownModel nargumun = new TownModel("Nargumun", 0);
		
		ubud.addEdge(kingdonOfLegmod);
		ubud.addEdge(principalityOfNekikh);

		kingdonOfLegmod.addEdge(kingdomOfOldcalia);
		kingdonOfLegmod.addEdge(principalityOfNekikh);
		kingdonOfLegmod.addEdge(principalityOfGritesthr);
		kingdonOfLegmod.addEdge(protetorateOfDrogove);
		kingdonOfLegmod.addEdge(ubud);

		principalityOfNekikh.addEdge(principalityOfGritesthr);
		principalityOfNekikh.addEdge(kingdonOfLegmod);
		principalityOfNekikh.addEdge(ubud);

		principalityOfGritesthr.addEdge(protetorateOfDrogove);
		principalityOfGritesthr.addEdge(kingdomOfLastwatch);
		principalityOfGritesthr.addEdge(kingdonOfLegmod);
		principalityOfGritesthr.addEdge(principalityOfNekikh);

		protetorateOfDrogove.addEdge(principalityOfGritesthr);
		protetorateOfDrogove.addEdge(kingdonOfLegmod);
		protetorateOfDrogove.addEdge(kingdomOfLastwatch);
		protetorateOfDrogove.addEdge(kingdomOfOldcalia);

		kingdomOfOldcalia.addEdge(protetorateOfDrogove);
		kingdomOfOldcalia.addEdge(kingdomOfKalb);
		kingdomOfOldcalia.addEdge(defalsia);
		kingdomOfOldcalia.addEdge(kingdonOfLegmod);
		kingdomOfOldcalia.addEdge(grandduchyOfSmalia);
		kingdomOfOldcalia.addEdge(kingdomOfLastwatch);
		kingdomOfOldcalia.addEdge(aymarLeague);

		kingdomOfKalb.addEdge(aymarLeague);
		kingdomOfKalb.addEdge(vuneseOfEmpire);
		kingdomOfKalb.addEdge(kingdomOfOldcalia);

		kingdomOfLastwatch.addEdge(protetorateOfDrogove);
		kingdomOfLastwatch.addEdge(grandduchyOfSmalia);
		kingdomOfLastwatch.addEdge(kingdomOfOldcalia);
		kingdomOfLastwatch.addEdge(principalityOfGritesthr);

		grandduchyOfSmalia.addEdge(kingdomOfLastwatch);
		grandduchyOfSmalia.addEdge(kingdomOfOldcalia);

		defalsia.addEdge(kingdomOfOldcalia);
		defalsia.addEdge(aymarLeague);

		vuneseOfEmpire.addEdge(aymarLeague);
		vuneseOfEmpire.addEdge(chandirSultanate);
		vuneseOfEmpire.addEdge(kingdomOfKalb);

		aymarLeague.addEdge(principalityOfKarhora);
		aymarLeague.addEdge(nargumun);
		aymarLeague.addEdge(bun);
		aymarLeague.addEdge(defalsia);
		aymarLeague.addEdge(vuneseOfEmpire);
		aymarLeague.addEdge(chandirSultanate);
		aymarLeague.addEdge(kingdomOfOldcalia);
		aymarLeague.addEdge(kingdomOfKalb);

		principalityOfKarhora.addEdge(aymarLeague);
		principalityOfKarhora.addEdge(nargumun);

		nargumun.addEdge(bun);
		nargumun.addEdge(aymarLeague);
		nargumun.addEdge(principalityOfKarhora);

		bun.addEdge(nargumun);
		bun.addEdge(chandirSultanate);
		bun.addEdge(aymarLeague);

		chandirSultanate.addEdge(aymarLeague);
		chandirSultanate.addEdge(vuneseOfEmpire);
		chandirSultanate.addEdge(bun);
		chandirSultanate.addEdge(principalityOfKasya);

		principalityOfKasya.addEdge(chandirSultanate);
		
	
		Player player = new Player(ubud);
	
	}

}
