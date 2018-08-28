import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseString {

	
	public static String reverseString66(String str) {
		char[] arrs = str.toCharArray();
		ArrayList<Object> arrayList = new ArrayList<>();
		for (char c: arrs) 
			arrayList.add(c);
		Collections.reverse(arrayList);
		ListIterator<Object> list = arrayList.listIterator();
		String result = "";
		while (list.hasNext()) 
			result += list.next();
		return result;
	}
	
	public static String reverseString6(String str) {
		char[] tmp = str.toCharArray();
		ArrayList<Object> arrayList = new ArrayList<>();
		
		for (char c: tmp) {
			arrayList.add(c);
		}
		
		Collections.reverse(arrayList);
		ListIterator<Object> list = arrayList.listIterator();
		String result = "";
		while (list.hasNext()) {
			result += list.next();
		}
		return result;
	}
	
	public static String reverseString55(String str) {
		if (str == null || str.isEmpty())
			return "";
		char[] arrs = str.toCharArray();
		int l = 0;
		int r = arrs.length - 1;
		while (l <= r) {
			char c = arrs[r];
			arrs[r] = arrs[l];
			arrs[l] = c;
			r--;
			l++;
		}
		return new String(arrs);
	}
	public static String reverseString5(String str) {
		if (str == null || str.isEmpty()) return "";
		char[] tmp = str.toCharArray();
		int left = 0;
		int right = str.length()-1;
		for (int j = 0; j < tmp.length; j++) {
			if (left <= right) {
				char c = tmp[right];
				tmp[right] = tmp[left];
				tmp[left] = c;
				right--;
				left++;
			}
		}
		return new String(tmp);
	}
	
	public static void reverseString4(String str) {
		StringBuilder newStr = new StringBuilder(str);
		newStr = newStr.reverse();
		System.out.println(newStr);
	}
	
	public static String reverseString44(String s) {
		StringBuilder newStr = new StringBuilder(s);
		newStr = newStr.reverse();
		return newStr.toString();
	}
	
	public static void reverseString3(String str) {
		byte[] result = new byte[str.length()];
		byte[] tmp = str.getBytes();
		int i = 0;
		for (int j = tmp.length - 1; j >= 0; j--) {
			result[i] = tmp[j];
			i++;
		}
		
		System.out.println(new String(result));
 	}
	
	public static void reverseString2(String str) {
		char[] tmp = str.toCharArray();
		char[] result = new char[tmp.length];
		int i = 0;
		for (int j =  tmp.length - 1; j >= 0 ; j--) {
			result[i] = tmp[j];
			i++;
		}
		System.out.println(new String(result));
	}
	
	public static void reverseString1(String str) {
		if (str == null || str.isEmpty()) return;
		String rString = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rString += str.charAt(i);
		}
		System.out.println(rString);
	}
	
}
