package game.town;

import java.util.ArrayList;
import java.util.List;

import game.graph.Edge;

public class TownModel {

	String name;
	int powerQuantity;
	List<Edge> neighboringTowns;
	
	
	public TownModel(String name, int powerQuantity) {
		super();
		this.name = name;
		this.powerQuantity = powerQuantity;
		this.neighboringTowns = new ArrayList<>();
	}
	
	public void addEdge(TownModel destiny,int powerQuantity) {
		Edge edge = new Edge(destiny,powerQuantity);
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
