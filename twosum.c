int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    
    //NESTED LOOPS 
    for(int i = 0; i < numsSize; i++) {
        for(int j = 0; j < numsSize; j++) {

            if(i == j) {
                continue;
            }

            if(nums[i] + nums[j] == target) {

                //INITIALIZE A RETURN ARRAY AND ASSIGN A MEMORY ALLOCATION FOR TWO INTS
                int* result = (int*)malloc(2 * sizeof(int));
                result[0] = i;
                result[1] = j;

                //ASSIGN THE POINTER RETURNSIZE FOR THE SIZE OF THE ARRAY
                *returnSize = 2;
                return result;
            }
        }
    }
    *returnSize = 0;
    return NULL;
}
