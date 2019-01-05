package misc;

import java.util.HashMap;
import java.util.Map;

/**
   A farmer has been asked to document the number of times his cows cross the road. 
   He carefully logs data about his cows' locations, making a series of N observations over the course of a single day. 
   Each observation records the ID number of a cow (an integer in the range 1 .. 10, since the farmer has 10 cows), 
   as well as which side of the road the cow is on (0 if the cow is on one side, 1 of the cow is on the other)

   Based on the data recorded by the farmer, please help him count the total number of confirmed crossings. 
   A confirmed crossing occurs when a consecutive sightings of a cow place it on different sides of the road.

   SAMPLE INPUT:

   3 1 << cow number 3 is on side 1
   3 0 << cow number 3 is now on side 0; crossing++
   6 0
   2 1
   4 1 << first reading for cow number 4
   3 0 << cow number 3 has not moved from side 0 because last time as well it was on side 0
   4 0 << cow number 4 has moved from side 1 to side 0; crossing++
   3 1 << cow number 3 has moved from side 0 to side 1; crossing++

   SAMPLE OUTPUT:

   3
   In this example, cow 3 crosses twice -- she first appears on side 1, then later appears on side 0, and then later still appears back on side 1. misc.Cow 4 definitely crosses once. Cows 2 and 6 do not appear to cross.

   Example: cows = {{3,1}, {3,0}, {6,0}, {2,1}, {4,1}, {3,0}, {4,0}, {3,1}}
 **/

public class CowsCrossing {
	static int count(int[][] cows) {
		int crossing = 0;
		if (cows == null || cows.length == 0)
			return crossing;

		Map<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < cows.length; i++) {
			if (hm.containsKey(cows[i][0]) && hm.get(cows[i][0]) != cows[i][1]) {
				crossing ++;
			} else {
				hm.put(cows[i][0], cows[i][1]);
			}
		}
		hm.put(null, null);
		hm.put(null, 9);
		for (Map.Entry entry: hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		return crossing;
	}

	public static void main(String[] args) {
		int[][] cows =  {{3,1}, {3,0}, {6,0}, {2,1}, {4,1}, {3,0}, {4,0}, {3,1}};
		System.out.println(count(cows));
	}
}







/*
public class CowsCrossing {
	public static int countCrossings(int[][] cows) {
	    int crossing = 0;
	    HashMap<Integer, Integer> hs = new HashMap<>();
	    for (int i = 0; i < cows.length; i++) {
	    		if (hs.containsKey(cows[i][0]) && (hs.get(cows[i][0]) != cows[i][1])) {
	    			crossing++;
	    		}
	    		else 
	    			hs.put(cows[i][0], cows[i][1]);
	    }
	    return crossing;
	}
	
	static int count(int[][] cows) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int count = 0;
		for (int i = 0; i < cows.length; i++) {
			if (hashMap.containsKey(cows[i][0]) && hashMap.get(cows[i][0]) != cows[i][1]) {
				count++;
			} else 
				hashMap.put(cows[i][0], cows[i][1]);
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[][] cows = {{3,1}, {3,0}, {6,0}, {2,1}, {4,1}, {3,0}, {4,0}, {3,1}, {6,1}};
		System.out.println(count(cows));
	}

}*/
