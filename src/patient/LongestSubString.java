package patient;

import com.sun.tools.javac.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/*
    Given a string s and a string t, check if s is subsequence of t.
    You may assume that there is only lower case English letters in both s and t.
    t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
    A subsequence of a string is a new string which is formed from the original string by deleting some (can be none)
    of the characters without disturbing the relative positions of the remaining characters.
    (ie, "ace" is a subsequence of "abcde" while "aec" is not).

    Example 1:
    s = "abc", t = "ahbgdc"
    Return true.

    Example 2:
    s = "axc", t = "ahbgdc"
    Return false.
*/
public class LongestSubString {
    public static void main(String[] args) {
        String str = "abppplee";
        List<String> list = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
        finSubString(str, list);

        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
        s = "axc"; t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    /*
    t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
     */
    static boolean isSubsequence(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.isEmpty())
            return  true;
        if (s.length() > t.length())
            return false;

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int i = 0, j = 0, matched = 0;
        while (i < s1.length && j < t1.length) {
            if (s1[i] == t1[j]) {
                i++; j++; matched++;
            } else {
                j++;
            }
        }
        return  matched == s1.length;

    }

    /*
    static boolean isSubsequence(String s, String t) {
        if (s == null || t == null) return false;
        if (s.isEmpty())
            return false;

        int l = 0, r = t.length() - 1;
        int i = 0;
        while (l < r && i < s.length() - 1) {
            if (s.charAt(i) == t.charAt(l)) {
                i++;
                l++;
            } else {
                l++;
            }
        }
        return (i == s.length() -1);
    }
    */


    static boolean finSubString(String str, List<String> list) {
        for (int k = 0; k < list.size() - 1; k++) {
            String sub = list.get(k);
            int l = 0, r = str.length() - 1;
            int i = 0;
            while (l < r && i < sub.length() - 1) {
                if (sub.charAt(i) == str.charAt(l)) {
                    l++;
                    i++;
                } else {
                    l++;
                }
            }
            if (i == sub.length() - 1) {
                System.out.println(sub);
            }
        }

        return  false;
    }

}
