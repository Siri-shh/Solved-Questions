class Solution {
    public int rob(int[] nums) {
    int sum=0;
    for(int i=0;i<nums.length;i++){
        if(i==0||i==1)
            continue;
        if(i==2){
            nums[i]+=nums[i-2];
            continue;
        }
        nums[i]=(nums[i]+nums[i-2])>(nums[i]+nums[i-3])?(nums[i]+nums[i-2]):(nums[i]+nums[i-3]);
    }
    int max=nums[0];
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max)
            max=nums[i];
    }
    return max;
    }
}