package smartBuilding;

import java.util.Objects;

public class SmartBuilding {
	private int id;
	private BuildingType type;
	private String location;
	private int numResidents;
	//private Floor[] numFloors;
	
	public SmartBuilding(int id, String type, String location, int numResidents) {
		
		this.id = id;
		this.type = BuildingType.valueOf(type); // must handle exception
		this.location = location;
		this.numResidents = numResidents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumResidents() {
		return numResidents;
	}

	public void setNumResidents(int numResidents) {
		this.numResidents = numResidents;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SmartBuilding)) {
			return false;
		}
		SmartBuilding other = (SmartBuilding) obj;
		return id == other.id && Objects.equals(location, other.location) && numResidents == other.numResidents
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "SmartBuilding id=" + id + ", type=" + type + ", location=" + location + ", numResidents="
				+ numResidents;
	} // galk a ssi khassna nbdloha
	
	

	
	
}
