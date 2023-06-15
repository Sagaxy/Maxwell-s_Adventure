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

		kingdomOfOldcalia.addEdge(protetorateOfDrogove, 3);
		kingdomOfOldcalia.addEdge(kingdomOfKalb, 2);
		kingdomOfOldcalia.addEdge(defalsia, -3);
		kingdomOfOldcalia.addEdge(kingdonOfLegmod, 2);
		kingdomOfOldcalia.addEdge(grandduchyOfSmalia, 1);
		kingdomOfOldcalia.addEdge(kingdomOfLastwatch, -2);
		kingdomOfOldcalia.addEdge(aymarLeague, 1);

		kingdomOfKalb.addEdge(aymarLeague, 1);
		kingdomOfKalb.addEdge(vuneseOfEmpire, 0);
		kingdomOfKalb.addEdge(kingdomOfOldcalia, 4);

		kingdomOfLastwatch.addEdge(protetorateOfDrogove, 3);
		kingdomOfLastwatch.addEdge(grandduchyOfSmalia, 1);
		kingdomOfLastwatch.addEdge(kingdomOfOldcalia, 4);
		kingdomOfLastwatch.addEdge(principalityOfGritesthr, 5);

		grandduchyOfSmalia.addEdge(kingdomOfLastwatch, -2);
		grandduchyOfSmalia.addEdge(kingdomOfOldcalia, 4);

		defalsia.addEdge(kingdomOfOldcalia, 4);
		defalsia.addEdge(aymarLeague, 1);

		vuneseOfEmpire.addEdge(aymarLeague, 1);
		vuneseOfEmpire.addEdge(chandirSultanate, 1);
		vuneseOfEmpire.addEdge(kingdomOfKalb, 2);

		aymarLeague.addEdge(principalityOfKarhora, -2);
		aymarLeague.addEdge(nargumun, 0);
		aymarLeague.addEdge(bun, 5);
		aymarLeague.addEdge(defalsia, -3);
		aymarLeague.addEdge(vuneseOfEmpire, 0);
		aymarLeague.addEdge(chandirSultanate, 1);
		aymarLeague.addEdge(kingdomOfOldcalia, 4);
		aymarLeague.addEdge(kingdomOfKalb, 2);

		principalityOfKarhora.addEdge(aymarLeague, 1);
		principalityOfKarhora.addEdge(nargumun, 0);

		nargumun.addEdge(bun, 5);
		nargumun.addEdge(aymarLeague, 1);
		nargumun.addEdge(principalityOfKarhora, -2);

		bun.addEdge(nargumun, 0);
		bun.addEdge(chandirSultanate, 1);
		bun.addEdge(aymarLeague, 1);

		chandirSultanate.addEdge(aymarLeague, 1);
		chandirSultanate.addEdge(vuneseOfEmpire, 0);
		chandirSultanate.addEdge(bun, 5);
		chandirSultanate.addEdge(principalityOfKasya, -7);

		principalityOfKasya.addEdge(chandirSultanate, 1);

	}

}
