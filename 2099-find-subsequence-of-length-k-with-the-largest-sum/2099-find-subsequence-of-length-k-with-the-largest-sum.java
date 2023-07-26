class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int num[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            num[i]=nums[i];
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[k];
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            count++;
            list.add(nums[i]);
            if(count==k)
                break;
        }
        int index=0;
        for(int i=0;i<num.length;i++){
            if(list.contains(num[i])){
                arr[index]=num[i];
                index++;
                list.remove(list.indexOf(num[i]));
            }
        }
        return arr;
    }
}