package is2.kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

	public static void main(String[] args) {
		String[] data = {"pepe", "hola", "hola", "pepe", "adiós", "pepe"};
		Histogram<String> histo = new Histogram<>(data);
		Map<String, Integer> histogr = histo.getHistogram();
		

		for (String key : histogr.keySet()) {
			System.out.println(key + "==>" + histogr.get(key));
		}
	}
}
