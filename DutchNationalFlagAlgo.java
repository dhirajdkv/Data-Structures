// https://leetcode.com/problems/sort-colors/
// My approach
class Solution {
    public void sortColors(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; ++i) {
            if (flag == true) {
                --i;
                flag = false;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    flag = true;
                    continue;
                }
            }
        }
        System.out.println(nums);
    }
}

// Best approach
class Solution {
  /*
  Dutch National Flag problem solution.
  */
  class Solution {
    public void sortColors(int[] nums) {
        int lo = 0, mid = 0;
        int hi = nums.length - 1;
        int temp;
        while (mid <= hi) {
            switch (nums[mid]) {
                case 0:
                    temp = nums[lo];
                    nums[lo++] = nums[mid];
                    nums[mid++] = temp;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[hi];
                    nums[hi--] = nums[mid];
                    nums[mid] = temp;
                    break;
            }
        }
    }
}
