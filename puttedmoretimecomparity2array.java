class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        for(int i = 0; i<nums1.length; i++){
            if(min>nums1[i]){
                min = nums1[i];
            }
        }
       
         if(min%2!=0)
                return true;
            
        for(int j =0; j<nums1.length; j++){
            if(nums1[j]%2!=0){
                return false;
            }
        }
        return true;
    }
}
