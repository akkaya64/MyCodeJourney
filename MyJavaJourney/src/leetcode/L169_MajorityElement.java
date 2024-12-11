package leetcode;

public class L169_MajorityElement {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element (nums1): " + majorityElement(nums1));
        System.out.println("Majority Element (nums2): " + majorityElement(nums2));
    }

    public static int majorityElement (int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}