package smartBuilding;
import java.util.*;
import devices.Appliance;
import devices.SensorNodes;

public class Apartment {
	private int ID;
  public SensorNodes sensorNode;
	public Map<String, Appliance> appliances;

	public Apartment(int ID) {
		this.ID = ID;
		this.sensorNode = new SensorNodes();
		this.appliances = new HashMap<String, Appliance>();
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public String toString() {
		String result = "[Apartment]";
		result = result.concat(sensorNode.toString());
		for (Appliance appliance : appliances.values()) {
			result = result.concat(appliance.toString());
		}
		return result;
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
