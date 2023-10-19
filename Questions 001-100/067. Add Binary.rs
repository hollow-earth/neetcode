impl Solution {
    pub fn add_binary(a: String, b: String) -> String {
		let rng: usize = std::cmp::max(a.len() as i32, b.len() as i32) as usize; 
		let a: Vec<char> = format!("{:0>width$}", a, width=rng).chars().rev().collect();
		let b: Vec<char> = format!("{:0>width$}", b, width=rng).chars().rev().collect();
		let mut carry: i32 = 0;
		let mut answer: Vec<char> = Vec::new();
		for i in 0..rng {
			match (a[i], b[i], carry) {
				('1', '0', 0) | ('0', '1', 0) | ('0', '0', 1) => {
					answer.push('1');
					carry = 0;
				},
				('1', '1', 0) | ('0', '1', 1) | ('1', '0', 1) => {
					answer.push('0');
					carry = 1;
				}
				('0', '0', 0) => { answer.push('0'); }
				('1', '1', 1) => {
					answer.push('1');
					carry = 1;
				}
				_ => {
					println!("Error: a: {}, b: {}", a[i], b[i])
				}
			}
		}
		if carry == 1 { answer.push('1'); }
		return answer.into_iter().rev().collect::<String>();
	}
}