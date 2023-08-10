class Solution {
    public int[][] merge(int[][] arr) {
     
      
//     Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

//     List<int[]> merged = new ArrayList<>();
//     int[] currentInterval = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//         if (currentInterval[1] >= arr[i][0]) {
//             currentInterval[1] = Math.max(currentInterval[1], arr[i][1]);
//         } else {
//             merged.add(currentInterval);
//             currentInterval = arr[i];
//         }
//     }
//     merged.add(currentInterval);

//     return merged.toArray(new int[0][]);


        
        int n = arr.length;
        
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            if(merged.isEmpty()|| arr[i][0]>merged.get(merged.size()-1)[1])
            {
                merged.add(new int[]{arr[i][0],arr[i][1]});
            }
            else
            {
                merged.get(merged.size()-1)[1]=Math.max(merged.get(merged.size()-1)[1],arr[i][1]);
            }
        }
        return merged.toArray(new int[0][]);
    }
}