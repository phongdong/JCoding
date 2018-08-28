import java.util.HashMap;
import java.util.Map;

/*
 *  Write a function which takes an array and emits the majority element (if it exists),
 *  otherwise prints NONE as follows
 *  I/P : 3 3 4 2 4 4 2 4 4
 *  O/P : 4
 */
public class MajorityElement {
	public void emitMajorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int v = nums[i];
			if (hm.containsKey(v)) {
			 	hm.put(v, hm.get(v) + 1);
			} else {
				hm.put(v, 1);
			}
		}
		
		Map.Entry<Integer, Integer> maxEntry = null;
		
		for (Map.Entry<Integer, Integer> m: hm.entrySet()) {
			System.out.println(m.getKey() + ": " + m.getValue());
			if (maxEntry == null || m.getValue().compareTo(maxEntry.getValue()) > 0)
				maxEntry = m;
		}
		
		if (maxEntry.getValue() > (nums.length / 2)) {
			System.out.println(maxEntry.getKey());
		} else {
			System.out.println("No Majority Element");
		}
		
	}
}
