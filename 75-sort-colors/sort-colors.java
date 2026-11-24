class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int freq[]=new int[3];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            while(freq[i]>0){
                nums[k]=i;
                k++;
                freq[i]--;
            }
        
        }
    }
}