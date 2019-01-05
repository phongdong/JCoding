package misc;

import java.math.BigDecimal;

public class Challenge {
	public static BigDecimal sum(final Object v) {
		BigDecimal sum = new BigDecimal("0.0");
		BigDecimal obj = new BigDecimal((String)v);
		System.out.println(obj);
		sum.add(obj);
		
		
//		if (v == null) {
//			return sum;
//		} else if ()
		
		System.out.println(sum);
		return sum;
	}

}
