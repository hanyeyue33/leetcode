package com.luojian.leetcode.easy;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        String maxEndingHere = "";
        String maxSoFar = "";
        StringBuilder sb = new StringBuilder();
        for (char each : s.toCharArray()) {
            int indexOfChar = maxEndingHere.indexOf(each);
            if (indexOfChar != -1) {
                sb = sb.delete(0, indexOfChar + 1);
            }
            sb.append(each);
            maxEndingHere = sb.toString();
            maxSoFar = sb.toString().length() > maxSoFar.length() ? sb.toString() : maxSoFar;
        }
        return maxSoFar.length();
    }
}
