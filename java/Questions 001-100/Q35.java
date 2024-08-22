class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0]) {return 0;}
        else if (target > nums[nums.length-1]) {return nums.length;}

        int prev, next;
        for (int i = 0; i < nums.length-1; i++) {
            prev = nums[i];
            next = nums[i+1];
            if (target == prev) {return i;}
            else if (target == next || (target > prev && target < next)) {return i+1;}
        }
        return 0;
    }
}