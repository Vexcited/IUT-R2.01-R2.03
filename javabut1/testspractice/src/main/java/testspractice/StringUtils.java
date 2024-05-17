package testspractice;

public class StringUtils {
	public static boolean isPalindrome(String candidate) {
		String candidateCleared = clearPunctuation(candidate);

		String candidateReverse = reverse(candidateCleared);
		return candidateCleared.equals(candidateReverse);
	}

	public static String clearPunctuation(String candidate) {
		StringBuilder clear = new StringBuilder();

		int length = candidate.length();
		for (int i = 0; i < length; i++) {
			char c = candidate.charAt(i);

			if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
				continue;
			}

			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			}

			clear.append(c);
		}

		return clear.toString();
	}

	public static String reverse(String candidate) {
		StringBuilder reverse = new StringBuilder();
		
		int length = candidate.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse.append(candidate.charAt(i));
		}
		
		return reverse.toString();
	}
}