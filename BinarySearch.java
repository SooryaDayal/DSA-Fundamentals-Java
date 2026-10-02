public class BinarySearch{

    public static void main(String args[]){
        int nums[]={3,4,6,7,9,10,14,16,18,19, 21, 23, 57, 60};
        int target=19;
        int result=binarySearch(nums, target);

        if (result==-1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at Index: " + result);
    }

    public static int binarySearch(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int steps=0;
        
        while(left<=right){
            steps++;
            int midElement= (left+right)/2;
            
            if(nums[midElement]==target){
                System.out.println("Steps taken by Binary Search: "+ steps);
                return midElement;
            }
            else if(nums[midElement]<target){
                left=midElement+1;
            }
            else
                right=midElement-1;
        }
        
        System.out.println("Steps taken by Binary Search: "+ steps);
        return -1;
    }
    
}