package RecursionArray;

public class SearchInrotatedarray {
    public static void main(String[] args) {

    }
    public static int searchinrotated(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target>=arr[s] && target<=arr[m]){
                return searchinrotated(arr, target,)
            }
        }
    }
}
