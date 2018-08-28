
public class ReverseStringTest 
{
	
	public void reverseString(String str){
		if (str == null || str.length() <= 1) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0, str.length() - 1));
		}
	}
	
	public String reverseString1(String s) {
		String str = "";
		if (s == null || s.length() <= 1) {
			return s;
		} else {
			str += s.substring(s.length() - 1) + reverseString1(s.substring(0, s.length() - 1));
		}
		return str;
	}
}
