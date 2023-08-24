class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        ArrayList<Integer> arr3 = new ArrayList<>();
        
        int i=0,j=0;
      while(i<n1 && j<n2)
      {
          if(nums1[i]<nums2[j])
          {
              arr3.add(nums1[i++]);
          }
          else
          {
              arr3.add(nums2[j++]);
          }
      }
      while(i<n1)
      {
          arr3.add(nums1[i++]);
      }
        
      while(j<n2)
      {
          arr3.add(nums2[j++]);
      }
        int n = n1+n2;
        
      if(n%2==1)
         {
          return (double) arr3.get(n/2);
         }
        
      double median = ((double)arr3.get(n/2)+(double)arr3.get((n/2)-1))/2.0;
     return median;        
        
    }
}