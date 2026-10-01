public class LinearSearch{

    public static void main(String args[]){

        int nums[]={3,76,89,3,68,25,2};
        int targetElement=89; 
        int result= linearSearch(nums, targetElement);

        if (result==-1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at Index: " + result);
    }

    public static int linearSearch(int nums[], int targetElement){
        for (int i=0; i<nums.length; i++){
            if (nums[i]==targetElement)
                return i;
        }
        return -1;
    }
        
    }
