package devices;

public class Appliance {

	private ApplianceType type;
	public String smartMeter;
	public boolean status = false;

	public Appliance(ApplianceType type) {
		this.type = type;

		int min = 0, max = 500;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    this.smartMeter = String.format("%d W", value);
	}

	public Appliance(String type) {
		this.type = ApplianceType.valueOf(type);

		int min = 0, max = 500;
    int value = (int) Math.floor(Math.random()*(max-min+1)+min);
    this.smartMeter = String.format("%d W", value);
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

	public void setSmartMeter(String smartMeter) {
		this.smartMeter = smartMeter;
	}

	public String getSmartMeter() {
		return this.smartMeter;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void Switch() {
		this.status = !this.status;
	}

	public String getStatus() {
		return this.status ? "ON" : "OFF";
	}

}
