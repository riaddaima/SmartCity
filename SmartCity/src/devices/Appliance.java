package devices;

public class Appliance {

	private ApplianceType type;
	private boolean status = false;
	public SmartMeter smartMeter;

	public Appliance(String type) {
		this.type = ApplianceType.valueOf(type); // must handle exception
		this.smartMeter = SensorNodesCollection.addSmartMeter();
	}

	public Appliance(ApplianceType type) {
		this.type = type;
		this.smartMeter = SensorNodesCollection.addSmartMeter();
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

	public boolean isStatus() {
		return status;
	}

	public String getStatus() {
		return status ? "ON" : "OFF";
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void Switch() {
		this.status = !this.status;
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
		return status == other.status && type == other.type;
	}

	@Override
	public String toString() {
		String result = "";
		result = result.concat(String.format("\n\t[Appliance] %s is %s with a consumption of %d W", getTypeName(), getStatus(), smartMeter.getValue()));
		return result;
	}
}
