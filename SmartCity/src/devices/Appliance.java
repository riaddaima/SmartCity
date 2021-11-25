package devices;

import java.util.Objects;

public class Appliance {
	private ApplianceType type;
	private boolean status = false;
	
	public Appliance(String type, boolean status) {
		this.type = ApplianceType.valueOf(type); // must handle exception
		this.status = status;
	}

	public ApplianceType getType() {
		return type;
	}

	public void setType(ApplianceType type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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
		return "Appliance : type=" + type + ", status=" + status;
	}
	
	
	
}
