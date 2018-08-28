import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.HashMap;

import javax.sound.midi.Soundbank;

/**
 * @author pdong
 *
 */


class Demo {
	
	 public static void main(String[] args)
	 {
		 String[] origItems = {"rice", "sugar","wheat", "cheese"};
		 float[] origPrices = {16.89f, 56.92f,20.89f, 345.99f};
		 String[] items = {"rice","cheese"};
		 float[] prices = {18.99f, 400.89f};
		 
		 verifyItems(origItems, origPrices, items, prices);
	     
	 }
	 
	// Complete the verifyItems function below.
	static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) { 
		int modifiedCount = 0;
		HashMap<String, Float> orignalHM = new HashMap<>();
		
		for (int i = 0; i < origItems.length; i++) {
			orignalHM.put(origItems[i], origPrices[i]);
		}
		
		for (int i = 0; i < items.length; i++) {
			if (orignalHM.containsKey(items[i]) && orignalHM.get(items[i]) != prices[i]) {
				modifiedCount++;
			}
		}
	
		return modifiedCount;

	}

}
