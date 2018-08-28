
public class CommonPrefix {
	
//	public static String longestCommonPrefix1(String[] strs) {
//		if (strs == null || strs.length == 0) return "";
//		String prefix = strs[0];
//		for (int i = 1; i < strs.length; i++) {
//			while (strs[i].indexOf(prefix) != 0) {
//				prefix = prefix.substring(0, prefix.length() - 1);
//				if (prefix.isEmpty()) 
//					return "";
//			}
//		}
//		return prefix;
//	}
	
	
	static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) 
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) != -1) {
				prefix = prefix.substring(0, prefix.length()-1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}
	
	
	
	
//	public static String longestCommenPrefix1(String[] strs) {
//		if (strs == null || strs.length == 0) return "";
//		String prefix = strs[0];
//		for (int i = 1; i < strs.length; i++) {
//			while (strs[i].indexOf(prefix) == -1) {
//				prefix = prefix.substring(0, prefix.length() - 1);
//				if (prefix.isEmpty())
//					return "";
//			}
//		}
//		return prefix;
//	}
//	
	public static String longestCommonPrefix9(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		for (int i = 0; i < strs.length; i++) {
			char c = strs[0].charAt(i);
			for (int j = 0; j < strs.length; j++) {
				if (strs[i].charAt(j) != c || i == strs[j].length()) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0];
	}
	
	public static String longestCommonPrefix2(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		for (int i = 0; i < strs.length; i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (c != strs[j].charAt(i) || i == strs[j].length())
					return strs[0].substring(0, i);
			}
		}
		return strs[0];
	}
	
	
	public static String longestCommonPrefix3(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		return longestCommonPrefix(strs, 0, strs.length - 1);
	}
	
	public static String longestCommonPrefix(String[] strs, int l, int r) {
		if (l == r) {
			return strs[l];
		} else {
			int mid = (l + r) / 2;
			String lcpLeft = longestCommonPrefix(strs, 0, mid);
			String lcpRight = longestCommonPrefix(strs, mid + 1, r);
			return commonPrefix(lcpLeft, lcpRight);
		}
	}
	
	public static String commonPrefix(String str1, String str2) {
		int min = Math.min(str1.length(), str2.length());
		for (int i = 0; i < min; i ++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return str1.substring(0, i);
			}
		}
		return str1.substring(0, min);
	}
	
	public static String longestCommonPrefix4(String[] strs) {
		if (strs == null || strs.length == 1) 
			return "";
		int minLen = Integer.MAX_VALUE;
		for (String str: strs)
			minLen = Math.min(minLen, str.length());
		int low = 1;
		int high = minLen;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isCommonPrefix(strs, mid)) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return strs[0].substring(0, (low + high) / 2);
		
	}
	
	public static boolean isCommonPrefix(String[] strs, int len) {
		String str1 = strs[0].substring(0, len);
		for (int i = 1; i < strs.length; i++)
			if (!strs[i].startsWith(str1))
				return false;
		return true;
	}

}
