package th_sapxep;

public class SelectionSort {
    public static int[] selectionSort(int[]array){
        int min;
        for(int i=0; i<array.length;i++){
            min=i;
            for (int j=i+1;j<array.length;j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
                if(min != i){
                    int temp= array[min];
                    array[min]=array[i];
                    array[i]=temp;
                }
            }
            return array;
        }

    }

