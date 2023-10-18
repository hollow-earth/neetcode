impl Solution {
    pub fn length_of_last_word(s: String) -> i32 {
        return s.split_whitespace().last().unwrap().len() as i32;
    }
}