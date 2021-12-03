package smartBuilding;

import java.util.*;

public class SmartBuilding {
	private int ID;
	private BuildingType type;
	private String location;
	private int numResidents;
	public Map<Integer, Floor> floors;
	public ControlRoom controlRoom;
	
	public SmartBuilding(int ID, String type, String location, int numResidents) {
		this.ID = ID;
		setType(type);
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

	public String getType() {
		String type = this.type.name();
		type = type.toLowerCase();
		type = type.substring(0, 1).toUpperCase() + type.substring(1);
		return type;
	}

	public void setType(String type) {
		this.type = BuildingType.valueOf(type.toUpperCase()); // must handle exception
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
		String result = "";
		result = result.concat(String.format("[Smart Building] is %s in %s with %d residents.", getType(), getLocation(), getNumResidents()));
		return result;
	}
		
}
