class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0],n=nums.length;
        for(int i =1;i<n;i++){
                if(i==0){
                if(a != nums[i+1]) {
                    return a;
                }
                }else if(i<(n-2) && nums[i] != nums[i-1] && nums[i] != nums[i+1]){
                        a = nums[i];
                }else if(i==(n-1) && nums[i] !=nums[i-1] ){
                    a= nums[i];
                }
        }
        return a;
    }
}