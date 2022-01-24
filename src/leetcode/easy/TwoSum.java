package leetcode.easy;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int nums[] = new int[length];
        for (int i=0;i<length;i++){
            nums[i]=scanner.nextInt();
        }
        int target = scanner.nextInt();
        int result[] = twoSum(nums, target);
        for (int res:result
             ) {
            System.out.println(res);
        }
    }
    private static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i]+nums[j];
                if(sum==target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        return res;
    }
}
