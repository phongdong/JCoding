import java.util.InputMismatchException;

public class MoriTest {
	private static final String ipv4Pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
	private static final String ipv6Pattern = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";
	
	public String ipAddressType(String ipaddress) {
		if (ipaddress.matches(ipv4Pattern)) {
			return "IPv4";
		} else if (ipaddress.matches(ipv6Pattern)) {
			return "IPv6";
		}  
		return "Invalid";
	}
	
	// I would check integer result in between 2^31 - 1 and -2^31, and throw exception if there is a very large number
	public static int stringToInt(String str) {
		int result = 0;
		int factor = 1;
		int len = str.length();
		boolean isNegative = str.charAt(0) == '-' ? true : false;
			
		for (int i = len - 1; i > 0; i--) {
			if (str.charAt(i) == '.') {
				throw new InputMismatchException("Input should be an integer"); 
			}
			
			result += (str.charAt(i) - '0') * factor;
			factor *= 10;
		}
		
		if (isNegative) 
			return -result;
		else {
			result += (str.charAt(0) - '0') * factor;
			factor *= 10;
			return result;
		}
	}
	
	
	// I would check float result in between -3.4E+38 to +3.4E+38, and throw exception if there is a very large number
	public static float stringToFloat(String str) {
		int decimal = 0;
		float result = 0;
		boolean isNegative = str.charAt(0) == '-' ? true : false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				decimal = i;
				break;
			}
		}
		if (decimal > 0) {
			float leftPart = (float)stringToInt(str.substring(0, decimal));
			float rightPart = (float) (stringToInt(str.substring(decimal+1, str.length())) /
					Math.pow(10, (str.length() - 1 - decimal)));
			
			result = isNegative == true ?  leftPart - rightPart : leftPart + rightPart;
		} else {
			
			//throw new InputMismatchException("Input should be a float number"); 
			result = stringToInt(str);
		}
		
		return result;
	}
}
