class KidsWiththeGreatestNumberofCandies{

 public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
    List<Boolean> list = new ArrayList<Boolean>();
      
         for(int i=0;i<candies.length;i++)
         {
             if(candies[i]+extraCandies>=max)
             {
                 list.add(true);
             }else
             {
                 list.add(false);
             }
         }

         return list;
    }
}