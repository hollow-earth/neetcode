class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0]) {return 0;}
        else if (target > nums[nums.length-1]) {return nums.length;}
        // Find whether the target is bigger or smaller than half
        int mid = (int) ((nums[0] + nums[nums.length-1]) / 2);
        int prev, next;

        // if (target > mid) {   
        //     for (int i = nums.length-1; i >= 0; i--) {
        //         prev = nums[i-1];
        //         next = nums[i];
        //         if (target == prev) {return i-1;}
        //         else if (target == next || (target < prev && target > next)) {return i-1;}
        //     }
        // }
        //else { // target <= mid
            for (int i = 0; i < nums.length-1; i++) {
                prev = nums[i];
                next = nums[i+1];
                if (target == prev) {return i;}
                else if (target == next || (target > prev && target < next)) {return i+1;}
            }
        //}
        return 0;
    }
}