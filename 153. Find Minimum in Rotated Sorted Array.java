class Solution {
    public int findMin(int[] nums) {
        int result = min(nums,0,nums.length-1);
        return result;
    }
    public int min(int nums[],int low,int high ){
        if(high<low){
            return nums[0];
        }
        if(high==low){
            return nums[low];
        }
        int mid = low+((high-low)/2);
         if (mid < high && nums[mid+1] < nums[mid])
            return nums[mid+1];
 
        
        if (mid > low && nums[mid] < nums[mid - 1])
            return nums[mid];
 
    
        if (nums[high] > nums[mid])
            return min(nums, low, mid-1);
        return min(nums, mid+1, high);
        
    }
    
}
