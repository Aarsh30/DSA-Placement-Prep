class Solution {
   
    private int lowerBound(int[]arr,int key)
    {

        int low=0;
        int hi=arr.length;
        while(low<hi)
        {
            int mid = low+(hi-low)/2;

            if(arr[mid]<key)
            {low=mid+1;}
            else{
                hi=mid;
            }

        }
        return low;
    }
    
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        int answer[] = new int [spells.length];
        int m = potions.length;
        int maxPotion =potions[m-1];

        for(int i=0;i<spells.length;i++)
        {int spell =spells[i];
        long minPotion =(long)Math.ceil((1.0*success)/spell);
        if(minPotion>maxPotion)
        {
            answer[i]=0;
            continue;
        }
        int index=lowerBound(potions,(int)minPotion);
        answer[i]=m-index;
        }
        return answer;
    }
}