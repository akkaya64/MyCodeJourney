package leetcode;

public class L80_RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = removeDuplacates(nums);

        System.out.println("k = " + k);
        System.out.println("Modified nums: ");
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i] + " ");
        }
    }

    public static int removeDuplacates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length <= 2) return nums.length;

        int index = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
