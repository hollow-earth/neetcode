impl Solution {
    pub fn remove_element(nums: &mut Vec<i32>, val: i32) -> i32 {
	let mut k: usize = 0;
	let nums_len: usize = nums.len();

	for i in 0..nums_len {
		if nums[i] != val{
			nums[k] = nums[i];
			k += 1;
		}
	}
	return k as i32;
	}
}