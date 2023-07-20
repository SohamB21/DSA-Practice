import java.util.*;
public class InsertionSort{
    public static void insertionSort(int arr[], int size) {
        int i, newCard, j;
        for(i=1; i<size; i++){
            newCard = arr[i];
            for(j=i-1; j>=0; j--){
                if(newCard < arr[j])
                    arr[j+1] = arr[j];
                else
                    break;
            }
            arr[j+1] = newCard;
        }
        for(i=0; i<size; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}