package misc;

import java.util.Arrays;
import java.util.Stack;

public class Crack {

    public static void main(String[] args) {
        //System.out.println(isUnique("helo"));
        //System.out.println(isPermutation("helo0", "oleh"));
        /*
        char[] names = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ', ' ',' '};
        replaceSpaces(names,13);
        */

        //String str = "tactcoappp";
        //System.out.println(isPermutationOfPalindrome2(str));

        System.out.println(isValidParenthesis("({[]()})()"));
    }

    static boolean isValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[')
                stack.push(']');
            else if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (!stack.isEmpty() && stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    //
    static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference)
                    return false;
                foundDifference = true;
            }
        }
        return true;
    }

    static boolean oneEditInsert(String s1, String s2) {
        int index1=0, index2=0;
        while(index1 < s1.length() && index2 < s2.length()) {
            if (s1.indexOf(index1) != s2.indexOf(index2)) {
                if (index1 != index2)
                    return false;
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }

    static boolean isPermutationOfPalindrome2(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        int countOdd = 0;

        for (char c : str.toCharArray()) {
            int index = getCharNumber(c);
            if (index != -1) {
                table[index]++;
                if (table[index] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    static boolean isPermutationOfPalindrome(String str) {
        int[] table = buildFrequencyTable(str);
        if (checkMaxOne(table)) return true;
        else return false;
    }

    static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    static int[] buildFrequencyTable(String str) {
        if (str == null || str.isEmpty())
            return new int[-1];

        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c: str.toCharArray()) {
            int index = getCharNumber(c);
            table[index]++;
        }
        return table;
    }

    static boolean checkMaxOne(int[] table) {
        boolean foundOdd = false;
        for (int count: table) {
            if (count % 2 == 1){
                if (foundOdd)
                    return false;
                foundOdd = true;
            }
        }
        return true;
    }


    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i;
        if (str.length == 0)
            return;

        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        index = trueLength + spaceCount*2;
        if (trueLength < str.length)
            str[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index-1] = str[i];
                index--;
            }
        }

        System.out.println(Arrays.toString(str));
    }

    public static boolean isPermutation(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        if (s.length() != t.length())
            return false;

        int[] tables = new int[128];
        for (char c: s_array) {
            tables[c]++;
        }

        for (char c: t_array) {
            tables[c]--;
            if (tables[c] < 0)
                return  false;
        }
        return  true;
    }




    public static boolean isUnique(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 1 ; i <= 128; i++) {
            char val = (char)i;
            System.out.println(i + " : " + val);

        }
        return  true;
    }




}
