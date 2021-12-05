package devices;

public class Switch {
  public boolean status = false;

  public void Switcher() {
    this.status = !this.status;
  }
  
	public String getStatus() {
		return status ? "ON" : "OFF";
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
