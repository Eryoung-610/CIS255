
public class test {

	public static void main(String[] args) {
		int[] array = { 13, 17, 24, 28, 29, 32, 34, 45, 49 };

		linearSearch(array, 38);
	}

	public static int linearSearch(int[] nums, int target) {
		int targetLocation = -1;

		boolean found = false;
		boolean gonePastTarget = false;

		int comparisonCount = 0;

		for (int i = 0; (i < nums.length && !found && !gonePastTarget); i++) {
			comparisonCount++;
			if (nums[i] == target) {
				found = true;
				targetLocation = i;
			} else if (nums[i] > target) {
				gonePastTarget = true;
			}
		}

		System.out.println("Comparison Count : " + comparisonCount);
		return targetLocation;
	}
}
