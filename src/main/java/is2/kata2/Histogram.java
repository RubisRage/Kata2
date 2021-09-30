package is2.kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Histogram {
	
	private int[] data;

	public Histogram(int[] data) {
		this.data = Arrays.copyOf(data, data.length);
	}

	public int[] getData() {
		return Arrays.copyOf(data, data.length);
	}
	
	public Map<Integer, Integer> getHistogram(){
		HashMap<Integer, Integer> histogram = new HashMap<>();
		
		for (int key : data) {
			histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
		}
		
		return histogram;
	}
}
