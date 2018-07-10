import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public class TraverseInfoRunImpl implements Runnable {

	private ConcurrentMap<String, Long> dataMap;

	@Override
	public void run() {
		Iterator<String> itr = dataMap.keySet().iterator();
		while (itr.hasNext()) {
			String ctryName = itr.next();
			System.out.println(ctryName + " has a population of" + dataMap.get(ctryName));

			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public TraverseInfoRunImpl(ConcurrentMap<String, Long> dataMap) {
		this.dataMap = dataMap;
	}

}
