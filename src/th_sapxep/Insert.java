package th_sapxep;

public class Insert {
    // 9, 4, 5, 8
    public static int[] insert(int[] array){
        for(int i=1;i<array.length;i++){
            int x=array[i];
            int pox=i;
            while (pox > 0 && x < array[pox-1]){
                array[pox]=array[pox-1];
                pox--;
            }
            array[pox]=x;
        }
        return array;
    }
}
//