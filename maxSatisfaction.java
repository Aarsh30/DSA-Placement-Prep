class maxSatisfaction {
    public int maxSatisfaction(int[] satisfaction) {

      Arrays.sort(satisfaction);

      int[] prev = new int[satisfaction.length + 2];
      Arrays.fill(prev,0);

      for(int index=satisfaction.length-1;index>=0;index--)
      {
          int[] dp = new int[satisfaction.length + 2];

          for(int time =1;time<=satisfaction.length;time++)
         { dp[time]=Math.max(satisfaction[index] * time + prev[time+1],prev[time]);
         }
            prev=dp;
    }
    return prev[1];
}}