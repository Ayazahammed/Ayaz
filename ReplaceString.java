package lab3;

import java.util.Scanner;

public class ReplaceString {
	static boolean alterString(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
			return false;
		}
		return true;
	}

	static String replaceConsonants(char[] s) {
		for (int i = 0; i < s.length; i++) {
			if (!alterString(s[i])) {

				if (s[i] == 'z') {
					s[i] = 'b';
				}

				else {
					s[i] = (char) (s[i] + 1);
					if (alterString(s[i])) {
						s[i] = (char) (s[i] + 1);
					}
				}
			}
		}
		return String.valueOf(s);
	}

	public static void main(String[] args) {
		String s = "AYAZ";

		System.out.println(replaceConsonants(s.toCharArray()));
	}
}
