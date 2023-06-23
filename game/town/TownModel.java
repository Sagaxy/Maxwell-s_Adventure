package game.town;

import java.util.ArrayList;
import java.util.List;

public class TownModel {

	String name;
	int powerQuantity;
	public List<Edge> neighboringTowns;

	// create a new instance vertex called town
	public TownModel(String name, int powerQuantity) {
		super();
		this.name = name;
		this.powerQuantity = powerQuantity;
		this.neighboringTowns = new ArrayList<>();
	}

	// add edges to vertex
	public void addEdge(TownModel destiny) {
		Edge edge = new Edge(destiny);
		neighboringTowns.add(edge);

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPowerQuantity() {
		return powerQuantity;
	}

	public void setPowerQuantity(int powerQuantity) {
		this.powerQuantity = powerQuantity;
	}


}
