#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    *returnSize=2;
    int* element = (int*)malloc(2*sizeof(int));
    int i,j;
    for(i=0;i<numsSize;i++){
        for(j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                element[0] = i;
                element[1] = j;
                return element;
            }
        }
    }
    element[0]=-1;
    element[1]=-1;
    return element;
}