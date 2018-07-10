import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public class DelRunImpl implements Runnable {
	private ConcurrentMap<String, Long> dataMap;
	private String keyToBeDel;

	public DelRunImpl(ConcurrentMap<String, Long> dataMap, String keyToBeDel) {
		this.dataMap = dataMap;
		this.keyToBeDel = keyToBeDel;
	}

	@Override
	public void run() {
		Iterator<String> itr = dataMap.keySet().iterator();

		while (itr.hasNext()) {
			String next = itr.next();

			if (next.equals(keyToBeDel)) {
				System.out.println("Removed");
				dataMap.remove(next);
				break;
			}

		}

	}

}
