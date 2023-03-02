class EvenDigits {
    public int findNumbers(int[] nums) {
        int count =0;

        for(int num : nums)
        {
            if(even(num))
            {
                count++;
            }
        }
    return count;
    }

    public boolean even(int num)
    {
          return digits(num)%2==0;
    }

    // static int digits(int num)
    // {
    //     int count=0;
    //     while(num>0)
    //      {
    //          count++;
    //          num=num/10;
    //      }
    // return count;}

    static int digits(int num)
    {
        return (int)Math.log10(num)+1;
    }
    
}