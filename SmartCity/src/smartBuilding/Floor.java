package smartBuilding;

import java.util.*;

public class Floor {
	private int ID;
	private int floorNum; // 0-indexed
	private int numAppartments;
	public Map<Integer, Apartment> apartments;
	
	public Floor(int ID, int floorNum) {
		this.ID = ID;
		this.floorNum = floorNum;
		this.apartments = new HashMap<Integer, Apartment>();
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getFloorNum() {
		return floorNum;
	}


	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Floor)) {
			return false;
		}
		Floor other = (Floor) obj;
		return ID == other.ID && floorNum == other.floorNum && numAppartments == other.numAppartments;
	}


	@Override
	public String toString() {
		return "Floor: ID=" + ID + ", floorNum=" + floorNum + ", numAppartments=" + numAppartments;
	}
	
}
