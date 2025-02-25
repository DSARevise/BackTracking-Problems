//find all the permutations if a given string
public class Permutations {

	public static void printPermutations(String str, String permutations, int index) {

		// base case
		if (str.length() == 0) {
			System.out.println(permutations);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			String newString = str.substring(0, i) + str.substring(i + 1);

			printPermutations(newString, permutations + currentChar, index + 1);
		}
	}

	public static void main(String[] args) {
		String str = "abc";
		printPermutations(str, "", 0);
	}

}
