package five;

import java.util.Arrays;

public class BubbleSort {
    
    
    public boolean isSorted = false; 

    public void bubbleSort(int[] array){
      
       while(!isSorted){
        isSorted = true;   
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i -1]){
                int tmp = array[i];
                array[i] = array[i -1];
                array[i-1] = tmp;
                isSorted = false;
                }
            }
        }
      
    }
    
    
}
