import java.util.* ;
import java.io.*; 
public class FloorCeil {
    public static void getFloorAndCeil(int[] arr, int n, int x) {
        //sorting the given array first, to implement binary search
        Arrays.sort(arr);
        int left= 0, right= n-1, mid;
        
        //finding floor
        int ansFloor = -1;
        while(left <= right){
            mid = left + (right-left)/2;

            if(arr[mid] <= x){
                ansFloor = arr[mid];
                left = mid+1;
            }
            else
                right = mid-1;
        }
        
        //finding ceil
        left= 0; right= n-1;
        int ansCeil = -1;
        while(left <= right){
            mid = left + (right-left)/2;

            if(arr[mid] >= x){
                ansCeil = arr[mid];
                right = mid-1;
            }
            else
                left = mid+1;
        }
        
        System.out.print("Floor = "+ansFloor+" Ceil = "+ansCeil);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        getFloorAndCeil(arr, n, x);
    }
}