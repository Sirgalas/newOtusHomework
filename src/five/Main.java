package five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    private static int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
    
    
    private static List<Integer> arrayTwo =  new ArrayList<>(List.of(64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36));
    
    
     public static void main(String[] args) {
         
        BubbleSort bubleSort = new BubbleSort();
        long timeStart =  System.currentTimeMillis();
        bubleSort.bubbleSort(array);
        long timeFinish =  System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " сек");
        System.out.println(Arrays.toString(array));
        long timeStartCollection =  System.currentTimeMillis();
        System.out.println(new CollectionSort().sort(arrayTwo));
        long timeFinishCollection =  System.currentTimeMillis();
        System.out.println(timeFinishCollection - timeStartCollection + " сек");
        
        
    }
}
