class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=-1;
        int temp=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                i++;
                 temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int k=i+1;
        for(int j=k;j<n;j++){
            if(nums[j]==1){
                i++;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int l=i+1;
        for(int j=l;j<n;j++){
            if(nums[j]==2){
                i++;
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }

        
    }
}