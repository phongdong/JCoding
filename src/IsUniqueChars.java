import java.util.Arrays;

public class IsUniqueChars {
	
	public static boolean isUniqueChars1(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) 
				return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean isUniqueChars2(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) return false;
			}
		}
		return true;
	}
	
	public static boolean isUniqueChars3(String str) {
		if (str == null) return false;
		if (str.isEmpty()) return true;
		String tmp = sortString(str);
		for (int i = 0; i < tmp.length()-1; i++) {
			if (tmp.charAt(i) == tmp.charAt(i+1)) return false;
		}
		return true;
	}
	
	public static String sortString(String str) {
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		return new  String(temp);
	}

}
