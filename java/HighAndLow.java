package java;

import java.util.Arrays;
public class HighAndLow {
  public static String highAndLow(String numbers) {
    String[] strNums = numbers.split(" ");
    int[] nums = new int[strNums.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(strNums[i]);
    }
    Arrays.sort(nums);
    String result = String.format("%d %d", nums[nums.length-1], nums[0]);
    return result;
  }
}