//WE USE A HASHSET BECAUSE SETS CAN ONLY CONTAIN UNIQUE TYPINGS
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        //INSTANTIATE A NEW SET
        Set<Integer> mySet = new HashSet<>();

      //FOR LOOP TO ADD ELEMENTS OF THE ARRY INTO THE SET
        for(int i = 0; i < nums.length; i++) {
            mySet.add(nums[i]);
        }        

        //CHECK IF THERE ARE OF EQUAL SIZE, IF YES NO DUPLICATES
        if(nums.length == mySet.size()) {
            return false;
        } else {
            return true;
        }
    }
}
