public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int candidate = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            count += (nums[i] == candidate) ? 1 : -1;
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajorityElement(arr));
    }
}
