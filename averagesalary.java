class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        Arrays.sort(salary);
        int sum=0;
        int count=0;
        for(int i=1;i<n-1;i++)
        {
                sum += salary[i];
                count++;
        }
     return (double) sum/count;


    }
}