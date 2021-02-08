package validateSubsequence;

public class ValidateSubsequence {

	public static void main(String[] args) {
		int[] array = new int[]{5, 1, 22, 25, 6, -1, 8, 10};
		int[] sequence = new int[] {1, 6, -1, 10};
		if (validateSubsequence(array, sequence)) {
			System.out.println("The sequence is a valid subsequence.");
		}else {
			System.out.println("The sequence is not a valid subsequence.");
		}
	}
	static boolean validateSubsequence(int[] array, int[] sequence) {
		boolean isValidated = false;
		int seqCount = 0, arrCount = 0;
		while (arrCount < array.length) {
			if(array[arrCount] == sequence[seqCount]) {
				seqCount++;
				if(seqCount == sequence.length) {
					return true;
				}
			}
			arrCount++;
		}
		return isValidated;
	}

}
