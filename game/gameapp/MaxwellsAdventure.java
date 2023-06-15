package game.gameapp;

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
		
		ubud.addEdge(kingdonOfLegmod, 2);
		ubud.addEdge(principalityOfNekikh, 1);

		kingdonOfLegmod.addEdge(kingdomOfOldcalia, 4);
		kingdonOfLegmod.addEdge(principalityOfNekikh, 1);
		kingdonOfLegmod.addEdge(principalityOfGritesthr, 5);
		kingdonOfLegmod.addEdge(protetorateOfDrogove, 3);
		kingdonOfLegmod.addEdge(ubud, 0);

		principalityOfNekikh.addEdge(principalityOfGritesthr, 5);
		principalityOfNekikh.addEdge(kingdonOfLegmod, 2);
		principalityOfNekikh.addEdge(ubud, 0);

		principalityOfGritesthr.addEdge(protetorateOfDrogove, 3);
		principalityOfGritesthr.addEdge(kingdomOfLastwatch, -2);
		principalityOfGritesthr.addEdge(kingdonOfLegmod, 2);
		principalityOfGritesthr.addEdge(principalityOfNekikh, 1);

		protetorateOfDrogove.addEdge(principalityOfGritesthr, 5);
		protetorateOfDrogove.addEdge(kingdonOfLegmod, 2);
		protetorateOfDrogove.addEdge(kingdomOfLastwatch, -2);
		protetorateOfDrogove.addEdge(kingdomOfOldcalia, 4);

		kingdomOfOldcalia.addEdge(principalityOfKasya, 0);
		kingdomOfOldcalia.addEdge(principalityOfKasya, 0);
		kingdomOfOldcalia.addEdge(principalityOfKasya, 0);
		kingdomOfOldcalia.addEdge(principalityOfKasya, 0);
		kingdomOfOldcalia.addEdge(principalityOfKasya, 0);
		kingdomOfOldcalia.addEdge(principalityOfKasya, 0);

		kingdomOfKalb.addEdge(principalityOfKasya, 0);
		kingdomOfKalb.addEdge(principalityOfKasya, 0);
		kingdomOfKalb.addEdge(principalityOfKasya, 0);

		kingdomOfLastwatch.addEdge(principalityOfKasya, 0);
		kingdomOfLastwatch.addEdge(principalityOfKasya, 0);
		kingdomOfLastwatch.addEdge(principalityOfKasya, 0);
		kingdomOfLastwatch.addEdge(principalityOfKasya, 0);

		grandduchyOfSmalia.addEdge(principalityOfKasya, 0);
		grandduchyOfSmalia.addEdge(principalityOfKasya, 0);

		defalsia.addEdge(principalityOfKasya, 0);
		defalsia.addEdge(principalityOfKasya, 0);

		vuneseOfEmpire.addEdge(principalityOfKasya, 0);
		vuneseOfEmpire.addEdge(principalityOfKasya, 0);
		vuneseOfEmpire.addEdge(principalityOfKasya, 0);

		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);
		aymarLeague.addEdge(principalityOfKasya, 0);

		principalityOfKarhora.addEdge(principalityOfKasya, 0);
		principalityOfKarhora.addEdge(principalityOfKasya, 0);

		nargumun.addEdge(nargumun, 0);
		nargumun.addEdge(nargumun, 0);
		nargumun.addEdge(nargumun, 0);

		bun.addEdge(nargumun, 0);
		bun.addEdge(nargumun, 0);
		bun.addEdge(nargumun, 0);

		chandirSultanate.addEdge(aymarLeague, 1);
		chandirSultanate.addEdge(vuneseOfEmpire, 0);
		chandirSultanate.addEdge(bun, 5);
		chandirSultanate.addEdge(principalityOfKasya, -7);

		principalityOfKasya.addEdge(chandirSultanate, 1);

	}

}
