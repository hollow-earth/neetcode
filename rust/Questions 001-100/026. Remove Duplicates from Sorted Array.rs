// Slightly more optimized for memory
impl Solution1 {
    pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
      const LIMIT: i32 = -101;
			let mut result: Vec<i32> = Vec::new();
			let mut previous_number: &i32 = &LIMIT;
			let mut count = 0;
			for item in nums.iter() {
				let accessed_item = *item;
				if accessed_item == *previous_number{ continue; }
				else {
					result.push(accessed_item);
					count += 1; 
				}
				previous_number = item;
			}
			*nums = result;
			return count;
    }
}

impl Solution2 {
    pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
			let mut result: Vec<i32> = Vec::new();
			let mut previous_number: i32 = -101;
			for item in nums.iter() {
				if item == &previous_number{ continue; }
				else { result.push(*item); }
				previous_number = *item;
			}
			*nums = result;
			return nums.len() as i32;
    }
}