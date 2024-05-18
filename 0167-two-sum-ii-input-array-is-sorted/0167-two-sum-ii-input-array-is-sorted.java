public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Found the pair, return their indices
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                // Move the left pointer to the right
                left++;
            } else {
                // Move the right pointer to the left
                right--;
            }
        }

        // No valid solution found
        return new int[0];
    }
}


//         int res[] = new int[2];
//         for(int i=0;i<numbers.length;i++)
//         {
//             for(int j = i+1;j<numbers.length;j++)
//             {
//                 if(numbers[i] + numbers[j] == target)
//                 {
//                     res[0] = i+1;
//                     res[1] = j+1;
//                 }
                    
//             }
//         }
//         return res;
        

        