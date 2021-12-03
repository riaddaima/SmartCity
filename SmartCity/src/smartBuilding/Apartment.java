package smartBuilding;
import java.util.*;
import devices.ApplianceType;
import devices.Appliance;
import devices.SensorNodes;

public class Apartment {
	private int ID;
  public ArrayList<SensorNodes> sensorNodes;
	public Map<ApplianceType, Appliance> appliances;

	public Apartment(int ID) {
		this.ID = ID;
		this.sensorNodes = new ArrayList<SensorNodes>();
		this.appliances = new HashMap<ApplianceType, Appliance>();
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
		for (SensorNodes sensorNode : sensorNodes) {
			result = result.concat(sensorNode.toString());
		}
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
