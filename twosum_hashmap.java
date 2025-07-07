import java.util.HashMap;

//SOLVE WITH HASH MAP
class Solution {
    public int[] twoSum(int[] nums, int target) {

        //HASMAP ASSIGN A VALUE TO AN INDEX
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int z = target - nums[i];

            //SEARCHING FOR AN EXISITNG COMPLEMENT TO INDEX
            if(map.containsKey(z)){
                return new int[] {map.get(z), i};
            }

            //IF NO COMPLEMENT ASSIGN FIRST VALUE TO THE INDEX
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}
