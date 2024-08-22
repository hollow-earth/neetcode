class Solution {
    public int mySqrt(int x) {
        if (x == 1 || x == 0) {return x;}

        float aPrev;
        aPrev = 1.0f;
        for (int i = 0; i < 25; i++){
            aPrev = (aPrev + x/aPrev)/2.0f;
        }
        
        if (x- (int) aPrev * (int) aPrev < 0) { aPrev -= 1.0f;}
        return (int) aPrev;
    }
}