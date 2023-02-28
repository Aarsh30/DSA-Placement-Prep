class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        while(low < high) {

            // Calculate middle index
            int mid = low + (high - low)/2;
            if(target > nums[mid])
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}