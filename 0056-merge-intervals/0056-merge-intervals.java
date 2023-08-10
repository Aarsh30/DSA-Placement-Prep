class Solution {
    public int[][] merge(int[][] arr) {
     
      
    Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (currentInterval[1] >= arr[i][0]) {
            currentInterval[1] = Math.max(currentInterval[1], arr[i][1]);
        } else {
            merged.add(currentInterval);
            currentInterval = arr[i];
        }
    }
    merged.add(currentInterval);

    return merged.toArray(new int[0][]);


    }
}