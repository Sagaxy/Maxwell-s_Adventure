package game.town;

public class TownModel {

	String name;
	int powerQuantity;
	
	

	public TownModel(String name, int powerQuantity) {
		super();
		this.name = name;
		this.powerQuantity = powerQuantity;
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
