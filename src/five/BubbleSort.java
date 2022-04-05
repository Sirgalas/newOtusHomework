package five;

public class BubbleSort {
    private int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
    
    public boolean isSorted = false; 

    public void bubbleSort(){
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    
    
}
