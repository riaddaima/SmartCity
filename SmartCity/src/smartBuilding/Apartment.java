package smartBuilding;

import java.util.Objects;

public class Apartment {
	private int ID;

	public Apartment(int ID) {
		this.ID = ID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "Apartment : ID=" + ID ;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Apartment)) {
			return false;
		}
		Apartment other = (Apartment) obj;
		return ID == other.ID;
	}
	
}
