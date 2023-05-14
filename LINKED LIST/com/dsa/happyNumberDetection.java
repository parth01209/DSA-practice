package com.dsa;

public class happyNumberDetection {
    class Solution {
        public boolean isHappy(int n) {
            int fast = n;
            int slow = n;
            do{
                slow = square(slow);
                fast = square(square(fast));

            } while(slow !=fast);
            if (slow == 1){
                return true;
            }
            return false;
        }
        public int square(int num){
            int ans = 0;
            while(num > 0){
                int rem = num % 10;
                ans = ans + rem*rem;
                num/= 10;

            }
            return ans;
        }
    }
}
