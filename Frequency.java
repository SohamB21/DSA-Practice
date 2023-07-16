import java.util.HashMap;
import java.util.Map;
class Frequency{
    static int arr[] = {1, 2, 3, 1, 1, 4};
    public static void main(String args[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int i, n = arr.length;
        for(i=0; i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            
        }
    }
}