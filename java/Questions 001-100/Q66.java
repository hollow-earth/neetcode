class Solution {
    public int[] plusOne(int[] digits) {
        int ret = 0;
        digits[digits.length-1] += 1;
        if (digits[digits.length-1] >= 10) {
            digits[digits.length-1] -= 10;
            ret += 1;
            for (int i = digits.length-2; i >= 0; i--){
                digits[i] += ret;
                if (ret >= 1) {ret -= 1;}
                if (digits[i] >= 10){
                    digits[i] -= 10;
                    ret += 1;
                }
            }
            if (ret >= 1){
                int[] digitsExtended = new int[digits.length+1];
                System.arraycopy(digits, 0, digitsExtended, 1, digits.length);
                digitsExtended[0] = ret;
                return digitsExtended;
            }
        }
        return digits;
    }
}