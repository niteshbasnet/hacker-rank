

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		String testString = "abaaccdeertss";
		System.out.println(hasUniqueChars1(testString));
		System.out.println(hasUniqueChars2(testString));
		
		System.out.println(checkPermutation1("aabbcc", "ccaabb"));
	}
	
	/**
	 * --------------------------------------------------------------------------------------------------------------------------
	 * 1.1) Check unique characters. Without using additional data structures.
	 * 
	 * @param String to be checked
	 * @return boolean true if has duplicate
	 * 
	 */
	public static boolean hasUniqueChars1(String str) {
		if (str.length() > 256)
			return false;
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}

		return true;
	}

	public static boolean hasUniqueChars2(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * Try using bit manipulation to save space by factor of 8
	 * @param str
	 * @return
	 */
	public static boolean hasUniqueChars3(String str){
		
		return true;
	}

	
	/**
	 * 1.3) Permutation check of String
	 * 
	 */
	public static boolean checkPermutation1(String str1, String str2) {
		return sort(str1).equals(sort(str2));		
	}

	public static String sort(String str) {
		char[] charString = str.toCharArray();
		Arrays.sort(charString);
		return new String(charString);
	}
	
	public static void checkPermutation2(String str1, String str2){
		int [] charCount = new int [256];
		
		char[] charArray = str1.toCharArray();
		
		for (char c : charArray) {
			int charAscii = (int)c;
			charCount[charAscii]++;			
		}
		
		for (int i = 0; i < str2.length(); i++) {
			
		}
		
	}

	/**
	 *  1.4) Replace spaces with %20
	 *  
	 */
	public static String replaceSpace(String str){
		char [] charset = str.toCharArray();
		int spaceCount=0;
		
		for (int i = 0; i < charset.length; i++) {
			if(charset[i] == ' ')
				spaceCount++;
		}
		
		int newLength = charset.length+spaceCount;
		
		for (int i = 0; i < newLength; i++) {
			
		}
		return null;
	}
}
