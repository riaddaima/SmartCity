package smartBuilding;

import java.util.*;

import smartStreet.SmartStreet;

public class SmartBuilding {
	private int ID;
	private BuildingType type;
	private SmartStreet location;
	private int numResidents;
	public Map<Integer, Apartment> apartments;
	public ControlRoom controlRoom;
	
	public SmartBuilding(int ID, String type, SmartStreet location, int numResidents) {
		this.ID = ID;
		setType(type);
		this.location = location;
		this.numResidents = numResidents;
		this.apartments = new HashMap<Integer, Apartment>();
		this.controlRoom = new ControlRoom();
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
		this.type = BuildingType.valueOf(type.toUpperCase());
	}

	public SmartStreet getLocation() {
		return location;
	}

	public void setLocation(SmartStreet location) {
		this.location = location;
	}

	public int getNumResidents() {
		return numResidents;
	}

	public void setNumResidents(int numResidents) {
		this.numResidents = numResidents;
	}
	
}
