

public class FindAnagram {

	public static void main(String[] args) {
		System.out.println(anagram("cat", "actor"));
	}

	public static boolean anagram(String needle, String haystack) {
		if (needle == null || haystack.length() == 0 || haystack == null)
			return false;
		if (needle.length() == 0)
			return true;
		
		return false;
	}
}