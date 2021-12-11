package smartStreet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.HashMap;

public class SmartStreetCollection {
	private static final AtomicInteger count = new AtomicInteger(0); // Auto-increment of Apartment ID;
  public static Map<Integer, SmartStreet> smartStreets = new HashMap<Integer, SmartStreet>() {{
    put(count.getAndIncrement(), new SmartStreet(count.get(), "My Smart Street 1"));
  }};
  
  public static SmartStreet addSmartStreet(String streetName) {
    SmartStreet smartStreet = new SmartStreet(count.incrementAndGet(), streetName);
    smartStreets.put(smartStreet.getID(), smartStreet);
    return smartStreet;
  }
}
