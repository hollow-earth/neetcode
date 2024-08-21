// Half-check, theoretically faster
impl Solution1 {
    pub fn is_palindrome(x: i32) -> bool {
				if x < 0 { return false; }
				let mut temp: i32 = x;
				let mut log_workaround: i32 = x;
				//let num_digits: u32 = x.ilog(10) + 1; Doesn't work on leetcode
				//let num_digits_to_reverse: u32 = num_digits.div_ceil(2); Doesn't work on leetcode
				let mut num_digits: u32 = 0;

				while log_workaround != 0 {
					log_workaround /= 10;
					num_digits += 1u32;
				}

				let mut digit: i32; 
				let mut reversed: i32 = 0;

				for _i in 1..=num_digits {
					digit = temp % 10;
					reversed = reversed * 10 + digit;
					temp /= 10;
				}
				return x == reversed;
		}
}

// Full check
impl Solution2 {
	pub fn is_palindrome(x: i32) -> bool {
		if x < 0 { return false; }
		// else if x < 10 { return true; }
		else {
			let x_string: String = x.to_string(); 
			return x_string.chars().rev().collect::<String>().to_string() == x_string; 
		}
	}
}