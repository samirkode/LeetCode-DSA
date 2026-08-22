class Solution {
    public int removeDuplicates(int[] nums) {
    //  int k = 1;

    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] != nums[i - 1]) {
    //             nums[k] = nums[i];
    //             k++;
    //         }
    //     }

    //     return k;


        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1; 
    }
}
