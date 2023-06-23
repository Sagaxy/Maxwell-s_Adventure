package game.town;

public class Edge {

	TownModel destiny;

	public TownModel getDestiny() {
		return destiny;
	}

	public void setDestiny(TownModel destiny) {
		this.destiny = destiny;
	}

	// constructor of the edges between the towns
	public Edge(TownModel destiny) {
		super();
		this.destiny = destiny;
	}

}
