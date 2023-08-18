class Solution {
    public int [] rotate(int[] nums, int k) {
        int len = nums.length-1;
        k=k%(len+1);
    nums= rev(nums,0,len-k);
    nums=rev(nums,len-k+1,len);
    nums=rev(nums,0,len);
    return nums;
       }
public int[] rev (int [] nums, int low ,int high)
{
    while(low<high)
    {
        int temp =nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
        high--;
        low++;

    }
    return nums;
}



}