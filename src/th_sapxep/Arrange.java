package th_sapxep;

import java.lang.reflect.Array;

public class Arrange {
    public static void main(String[] args) {
       int[] arr={9,4,3,2,4,6,8,1};
        int[] result=SelectionSort.selectionSort(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
        System.out.println();
        int[] result1=BubbleAlgorithm.bubbleAlgorithm(arr);
        for(int num:result1){
            System.out.print(num+" ");
        }
        System.out.println();
        int[] result2=Insert.insert(arr);
        for(int num:result2){
            System.out.print(num+" ");
        }
    }
}
