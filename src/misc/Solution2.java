package misc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution2 {

	// public static void main(String[] args) {
	//
	// try {
	// System.out.println(doStuff(args));
	// }
	//
	// catch (Exception e) {
	// System.out.println("exc");
	// }
	//
	// doStuff(args);
	// }
	// static int doStuff(String[] args) {
	//
	// return Integer.parseInt(args[0]);
	// }

//	public static void main(String args[]) {
//		int[] arr = { 1, 2, 3, 4 };
//		call_array(arr[0], arr);
//		System.out.println(arr[0] + "," + arr[1]);
//	}
//
//	static void call_array(int i, int arr[]) {
//		arr[i] = 6;
//		i = 5;
//	}
	
	public static void main(String args[]) {
	String[] commands = {"L", "R", "GLGLGLG", "G", "GGGGR"};
		//String[] commands = {"GGGGR", "RGGGG"};
		System.out.println(Arrays.toString(doesCircleExist(commands)));
	}
	
	static String[] doesCircleExist(String[] commands) {
		String[] result = new String[commands.length];
		
		for (int i = 0; i < commands.length; i++) {
			String input = commands[i];
			if (input.length() > 1) {
				while (input.charAt(0) == 'G') {
					input = input.substring(1, input.length());
				}
				while(input.charAt(input.length()-1) == 'G') {
					input = input.substring(0, input.length()-1);
				}
			}
			
			char[] command = input.toCharArray();
			String circle = isLoop(command) ? "YES" : "NO";
			result[i] = circle;
		}
		
		return result;
    }
	
	static boolean isLoop(char[] command) {
		int x = 0, y = 0, direction = 0;
		for (int i = 0; i < command.length; i++) {
			
			char move = Character.toUpperCase(command[i]);
			
			
			if (move == 'R')
				direction = (direction + 1) % 4;
			else if (move == 'L') 
				direction = (4 + direction - 1) % 4;
			else {
				if (direction == 0)
		            y++;
		         else if (direction == 1)
		            x++;
		         else if (direction == 2)
		            y--;
		         else 
		            x--;
			}
		}
		return (x==0 && y==0);
	}

}
