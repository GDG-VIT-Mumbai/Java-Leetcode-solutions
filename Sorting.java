class Sorting{
    //this question can be solve in many ways.
    //here I have covered some basic linear sorting methods.
    
    //Bubble sort method
    public void sortColors1(int[] nums){
        int flag = 0; 
        for(int i = 0; i < nums.length-1; i++){
            for(int j = 0; j < nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = 1; 
                }
            }
            if(flag == 0){
                break;
            }
        }
    }
    
    //Selection sort method
    public void sortColors2(int[] nums) {

       for(int i=0; i<nums.length; i++){
        int smallest = i;
        for(int j = i+1; j<nums.length; j++){
            if(nums[j] < nums[smallest]){
                smallest = j;
            }
        }

        int temp = nums[smallest];
        nums[smallest] = nums[i];
        nums[i] = temp;
       }
    }
    
    //Insertion sort method
    public void sortColors3(int[] nums){
        int temp;
        for(int i = 1; i < nums.length; i++){
            temp = nums[i];
            int j = i-1;
            
            while(j >= 0 && temp < nums[j]){
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = temp;
        }
    }
    
}
