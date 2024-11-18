package leetcode;

import java.util.Arrays;

public class L27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2, 8};
        int val = 2;

        int k = removeElement(nums, val);

        Arrays.sort(nums, 0, k);
        System.out.println("k = " + k);
        System.out.println("nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
