class Solution {
    public int trap(int[] height) {
        
        //two pointer solution
        int left = 0;
        int right = height.length - 1;

        //set max of left pointer and right pointer
        int leftMax = 0;
        int rightMax = 0;

        //water block vlaue solution
        int water = 0;

        //while the left index value is less than the right one
        while(left < right) {

            //if the current left height is less than the right height
            if(height[left] < height[right]) {

                //check current left is new leftMax
                //this is also our check to fiund any valleys for trapped water
                if(height[left] > leftMax) {

                    //set new leftMax
                    leftMax = height[left];
                } else{

                    //if not new left max, subtract from the current max and add to the water
                    water += leftMax - height[left];
                }

                left++;
            } else {

                //if the current right height isd greater than previous right max
                if(height[right] > rightMax) {

                    //set new right max
                    rightMax = height[right];

                } else {

                    //add the trapped water 
                    water += rightMax - height[right];
                }

                right--;
            }

        }

        return water;
    }
}
