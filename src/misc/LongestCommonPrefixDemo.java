package misc;

public class LongestCommonPrefixDemo {

	public static void main(String[] args) {
		String[] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.lcp1(strs));

		// String prefix = strs[0];
		System.out.println(strs[1].indexOf(strs[1]));
		//		System.out.println(strs[2].indexOf(prefix));
		//		System.out.println(strs[3].indexOf(prefix));
		
	}

}
