// Less optimized
impl Solution1 {
    pub fn move_zeroes(nums: &mut Vec<i32>) {
		let mut j: usize = 0;
		for i in 0..nums.len(){
			if nums[i] != 0{
				nums.swap(i, j);
				j += 1;
			}
		}
    }
}

// A bit more optimized for runtime
impl Solution2 {
    pub fn move_zeroes(nums: &mut Vec<i32>) {
		let mut nums_result: Vec<i32> = Vec::new();
		for i in 0..nums.len(){
			if nums[i] != 0 {
				nums_result.push(nums[i]);
			}
		}
		nums_result.resize(nums.len(), 0);
		*nums = nums_result;
	}
}