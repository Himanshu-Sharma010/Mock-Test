package in.ineuron.main;

import java.util.Arrays;

public class Practice {
	

    
    public static void main(String [] args) {
    	int [] nums =  {0,1,0,3,6,4,34,134,75,05,3,45,0};
    	
    	 int count = 0; 
         
         for (int i = 0; i < nums.length; i++) {
             if (nums[i] != 0) {
                 int temp = nums[i];
                 nums[i] = nums[count];
                 nums[count] = temp;
                 
                 count++;
             }
         }
         
         System.out.println(Arrays.toString(nums));
    	 
    	 
    }
}
