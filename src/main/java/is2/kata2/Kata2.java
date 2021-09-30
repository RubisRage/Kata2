package is2.kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

	public static void main(String[] args) {
		int[] data = {1, 1, 2, 9, 3, 7, 5, 4, 2, 3, 3, 10, 9 ,0, 3};
		Histogram histo = new Histogram(data);
		Map<Integer, Integer> histogr = histo.getHistogram();
		

		for (Integer key : histogr.keySet()) {
			System.out.println(key + "==>" + histogr.get(key));
		}
	}
}
