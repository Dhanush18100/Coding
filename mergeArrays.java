import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
         int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8, 10};
         int n = arr1.length, m = arr2.length;
        int res[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;;
         while (i < n && j < m){
                if(arr1[i]<=arr2[j]){
                    res[k++]=arr1[i++];
                }else{
                    res[k++]=arr2[j++];
                }
            }
            while (i < n) {
            res[k++] = arr1[i++];
        }

        // copy remaining elements of arr2
        while (j < m) {
            res[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(res));
    }
}
