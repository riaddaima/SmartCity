package smartBuilding;

import java.util.*;

public class SmartBuilding {
	private int ID;
	private BuildingType type;
	private String location;
	private int numResidents;
	public Map<Integer, Floor> floors;
	
	public SmartBuilding(int ID, String type, String location, int numResidents) {
		this.ID = ID;
		this.type = BuildingType.valueOf(type.toUpperCase()); // must handle exception
		this.location = location;
		this.numResidents = numResidents;
		this.floors = new HashMap<Integer, Floor>();
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
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

	public void setFloors(Floor floor) {
		floors.put(floor.getID(), floor);
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
		return ID == other.ID && Objects.equals(location, other.location) && numResidents == other.numResidents
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "SmartBuilding ID=" + ID + ", type=" + type + ", location=" + location + ", numResidents="
				+ numResidents;
	}
		
}
