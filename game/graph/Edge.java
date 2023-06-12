package game.graph;

import game.town.TownModel;

public class Edge {
	
	TownModel destiny;
    int cost;

    public Edge(TownModel destiny, int cost) {
        this.destiny = destiny;
        this.cost = cost;
    }

}
