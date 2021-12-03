package devices;
import java.util.concurrent.atomic.AtomicInteger;

import smartBuilding.ControlRoom;

public class NetworkGatewayCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of NetWorkGateway ID;
  
  public static void addNetworkGateway(ControlRoom controllRoom) {
    controllRoom.networkGateway = new NetworkGateway(count.incrementAndGet(), count.incrementAndGet(), count.incrementAndGet());
  }
}
