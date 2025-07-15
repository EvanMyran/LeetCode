//DEFINE A CLASS
class Solution {
//DEFINE AS PUBLIC
public:
    bool isPalindrome(int x) {
        
        //CHECK FOR 0 CASE
        if(x == 0) return true;

        //CHECK FO RNEGATIVES AND ANYTHING ENDING IN 0
        if(x < 0 || x % 10 == 0) return false;

        //HEAD POINTER
        long i = x;
        //TAIL POINTER
        long j = 0;

        //WHILE LOOP
        while(x > 0) {
            //REMAINDER OF X / 10
            int z = x % 10;
            //SHIFT TAIL POINTER A DECIMAL PLACE AND ADD REMAINDER
            j = j * 10 + z;
            //SHIFT X BACK A DECIMAL
            x = x / 10;
        }

        //RETURN T OR F PALINDROME
        return i == j;
    }
};
