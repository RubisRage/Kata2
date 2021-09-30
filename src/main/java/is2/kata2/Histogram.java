package is2.kata2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
	
	private T[] data;

	public Histogram(T[] data) {
		this.data = Arrays.copyOf(data, data.length);
	}

	public T[] getData() {
		return Arrays.copyOf(data, data.length);
	}
	
	public Map<T, Integer> getHistogram(){
		HashMap<T, Integer> histogram = new HashMap<>();
		
		for (T key : data) {
			histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
		}
		
		return histogram;
	}
}
