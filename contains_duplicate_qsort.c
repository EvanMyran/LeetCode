#include <stdlib.h>
#include <stdbool.h>
//INCLUDE STANDARD LIBRARY AND header file in C provides boolean type support, defining bool, true, and false as macros

//Compare function for a and b
int compare(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

bool containsDuplicate(int* nums, int numsSize) {
    // Step 1: Sort the array
    //QSORT PARAMETERS
    //void qsort(void *base, size_t num, size_t size, int (*compare)(const void *, const void *));
    qsort(nums, numsSize, sizeof(int), compare);

    // Step 2: Scan for adjacent duplicates
    //FOR LOOP 
    for (int i = 0; i < numsSize - 1; i++) {
        //IF THE CURRENT INDEX IS EQUAL TO THE NEXT ONE, BECAUSE WE SORTED THE ARRAY
        if (nums[i] == nums[i + 1]) {
            return true;
        }
    }

    return false;
}
