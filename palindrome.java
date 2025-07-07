class Solution {
    public boolean isPalindrome(int x) {
        //THE POINT OF THIS IS TO SHIFT USING FACOTRS OF 10 TO SHIFT THE DECIMAL POINT OF THE NUMBERS

        //IMMEDIATE CHECK FOR ALL VALUES ENDING IN ZERO AND ZERO
        if(x == 0) {
            return true;
        }
        
        if(x < 0 || x % 10 == 0) {
            return false;
        }

        //SET THE REVERSE AS EMPTY
        int reverse = 0;
        int og = x; //X = 121
        while(x > 0) {

            //CREATE A TEMP VARIABLE, REMAINDER DIVIDE BY 10, TEMP IS THE REMAINDER
            int temp = x % 10; // = 121 % 10 = 12 + 1 | = 12 % 10 = 1 + 2 | = 1 % 10 = 1

            //USE RECURSION, REVERSE TIMES 10 PLUS THE TEMP VARIABLE
            reverse = reverse * 10 + temp; // = 0 * 10 + 1 = 1 | 1 * 10 + 2 = 12 | 12 * 10 + 1 = 121

            //FLAT DIVIDE X BY 10
            x = x / 10; // = 121 / 10 = 12 | = 12 / 10 = 1 | 1 / 10 = 0
        }
        return og == reverse;
    }
}
