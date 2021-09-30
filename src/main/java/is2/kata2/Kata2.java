package is2.kata2;

import java.util.HashMap;

public class Kata2 {

	public static void main(String[] args) {
		int[] data = {1, 1, 2, 9, 3, 7, 5, 4, 2, 3, 3, 10, 9 ,0, 3};
		HashMap<Integer, Integer> histogram = new HashMap<>(); 
		
		for (int i = 0; i < data.length; i++) {
			Integer value = histogram.get(data[i]);	
			
			if(value == null)
				histogram.put(data[i], 1);
			else
				histogram.put(data[i], value+1);
		}

		for (Integer key : histogram.keySet()) {
			System.out.println(key + "==>" + histogram.get(key));
		}
	}
}
