package smartBuilding;

import java.util.Objects;

public class Floor {
	private int ID;
	private int floorNum; // 0-indexed
	private int numAppartments;
	
	
	public Floor(int iD, int floorNum, int numAppartments) {
		ID = iD;
		this.floorNum = floorNum;
		this.numAppartments = numAppartments;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public int getFloorNum() {
		return floorNum;
	}


	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}


	public int getNumAppartments() {
		return numAppartments;
	}


	public void setNumAppartments(int numAppartments) {
		this.numAppartments = numAppartments;
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
