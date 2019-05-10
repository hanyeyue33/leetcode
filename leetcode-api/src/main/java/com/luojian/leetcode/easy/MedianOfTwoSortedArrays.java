package com.luojian.leetcode.easy;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        // ensuring that the first array is shorter or of the same length as the second array
        if (m > n)
            return findMedianSortedArrays(nums2, nums1);
        int low = 0;
        int high = m;
        while (low <= high) {
            // partition of nums1
            int px = (low + high) / 2;
            // partition of nums2
            int py = ((m + n + 1) / 2) - px;
            int maxLeftX = (px == 0) ? Integer.MIN_VALUE : nums1[px - 1];
            int minRightX = (px == m) ? Integer.MAX_VALUE : nums1[px];
            int maxLeftY = (py == 0) ? Integer.MIN_VALUE : nums2[py - 1];
            int minRightY = (py == n) ? Integer.MAX_VALUE : nums2[py];
            System.out.println("px=" + px + ",py=" + py);
            System.out.println("low=" + low + ",high=" + high + ",maxLeftX=" + maxLeftX + ",minRightX=" + minRightX + ",maxLeftY=" + maxLeftY + ",minRightY=" + minRightY);
            if ((maxLeftX <= minRightY) && (maxLeftY <= minRightX)) {
                if (((m + n) % 2) == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = px - 1;
            } else {
                low = px + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] nums2 = new int[]{4, 6, 7, 22};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
