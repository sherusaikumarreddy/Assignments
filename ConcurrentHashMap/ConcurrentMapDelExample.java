import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDelExample {

	public static void main(String[] args) {
		ConcurrentMap<String, Long> dataMap = createDataMap();
		DelRunImpl delImpl = new DelRunImpl(dataMap, "Lisbon");
		TraverseInfoRunImpl traverseImpl = new TraverseInfoRunImpl(dataMap);

		Thread traverseThread = new Thread(traverseImpl);
		Thread delThread = new Thread(delImpl);

		traverseThread.start();
		delThread.start();

	}

	private static ConcurrentMap<String, Long> createDataMap() {
		ConcurrentMap<String, Long> dataMap = new ConcurrentHashMap<String, Long>();
		dataMap.putIfAbsent("NYC", new Long(20000000));
		dataMap.putIfAbsent("SFO", new Long(17500000));
		dataMap.putIfAbsent("Chicago", new Long(16500000));
		dataMap.putIfAbsent("London", new Long(24000000));
		dataMap.putIfAbsent("Tokyo", new Long(34500000));
		dataMap.putIfAbsent("New Delhi", new Long(10000000));
		dataMap.putIfAbsent("Bangalore", new Long(9500000));
		dataMap.putIfAbsent("Lisbon", new Long(6500000));
		return dataMap;

	}

}
