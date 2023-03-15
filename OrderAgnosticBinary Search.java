import java.util.*;

class Main
{

 public static void main(String[] args) {

    int arr [] ={10,2,4,6,7};
    int target =4;
    
    System.out.println(BinarySearch(arr,target));

}

    static int BinarySearch(int arr[] , int target)

    {

        int start=0;
        int end = arr.length -1;
        
          boolean isAsc = arr[start] < arr [end];
          
        while(start<=end)
            {
                int mid = start +(end-start)/2;
                
                if(target == arr[mid])
                {return mid;
                    
                }   
                
                if(isAsc == true)
                
                {
                if(target>arr[mid])
                {
                    start = mid + 1;
                }
                else 
                {
                    end = mid -1;
                }
              
                 }
                 else
                 {
                     if(target<arr[mid])
                {
                    end = mid - 1;
                }
                else 
                {
                    start = mid + 1;
                }
                 }
            }    
                return -1;
            }

    }
