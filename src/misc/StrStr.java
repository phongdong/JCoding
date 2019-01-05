package misc;

public class StrStr {
	public static int strStr1(String haystack, String needle) {
		if (needle == null || haystack == null) 
			return -1;
		
		for (int i = 0; ; i++) {
			for (int j = 0; ; j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length()) 
					return -1;
				if (needle.charAt(j) != haystack.charAt(i+j))
					break;
				
			}
		}
	}
	
	public static int strStr2(String haystack, String needle) {
		if (haystack == null || needle == null) 
			return -1;
		if (haystack.length() == 0 && needle.length() == 0)
			return 0;
		if (haystack.length() == needle.length())
			return haystack.equals(needle) ? 0 : 1;
		
		for (int i = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				for (int j = 1; j < needle.length(); j++) {
					if (haystack.charAt(i + j) != needle.charAt(j))
						break;
					if (j == needle.length()-1)
						return i;
				}
			}
		}
		return -1;
	}
}
