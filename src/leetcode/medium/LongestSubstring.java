package leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        String userValue;
        Scanner scanner = new Scanner(System.in);
        userValue = scanner.next();
        int maxStringLength = lengthOfLongestSubstring(userValue);
        System.out.println(maxStringLength);
    }

    private static int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<>();
        int length = s.length();
        int maxStringLength = 0;
        char charArray[] = s.toCharArray();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (queue.contains(c)) {
                if (maxStringLength < queue.size()) {
                    maxStringLength = queue.size();
                }
                queue.remove();
                i--;
            } else {
                queue.add(c);
                if (maxStringLength < queue.size()) {
                    maxStringLength = queue.size();
                }
            }
        }
        return maxStringLength;
    }

}
