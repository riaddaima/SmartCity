package devices;

public class Appliance {

	private ApplianceType type;
	public SmartMeter smartMeter;
	public Switch switchAppliance;

	public Appliance(ApplianceType type) {
		this.type = type; // must handle exception
		this.smartMeter = new SmartMeter();
		this.switchAppliance = new Switch();
	}

	public Appliance(String type) {
		this.type = ApplianceType.valueOf(type); // must handle exception
		this.smartMeter = new SmartMeter();
		this.switchAppliance = new Switch();
	}

	public ApplianceType getType() {
		return type;
	}

	public String getTypeName() {
		String type = this.type.name();
		type = type.toLowerCase();
		type = type.substring(0, 1).toUpperCase() + type.substring(1);
		return type;
	}

	public void setType(ApplianceType type) {
		this.type = type;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Appliance)) {
			return false;
		}
		Appliance other = (Appliance) obj;
		return switchAppliance.status == other.switchAppliance.status && type == other.type;
	}

	@Override
	public String toString() {
		String result = "";
		result = result.concat(String.format("\n\t[Appliance] %s is %s with a consumption of %d W", getTypeName(), switchAppliance.getStatus(), smartMeter.getValue()));
		return result;
	}
}
