impl Solution {
    pub fn roman_to_int(s: String) -> i32 {
			let mut last_digit: char = '\0';
			let mut sum: i32 = 0;

			for item in s.chars() {
				match item {
					'I' => sum += 1,
					'V' => if last_digit == 'I' {sum += 3} else {sum += 5},	
					'X' => if last_digit == 'I' {sum += 8} else {sum += 10},
					'L' => if last_digit == 'X' {sum += 30} else {sum += 50},
					'C' => if last_digit == 'X' {sum += 80} else {sum += 100},
					'D' => if last_digit == 'C' {sum += 300} else {sum += 500},
					'M' => if last_digit == 'C' {sum += 800} else {sum += 1000},
					_ => {},
				};
				last_digit = item;
			}
			return sum;
    }
}