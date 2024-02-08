class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            int rest = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(rest == nums[j])
                    return new int[] {i, j};
            }
        }
        return new int[] {};
    }
}


//Test cases [2,7,11,15]     [3,2,4]     [3,3]