import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int result[]=findMinAndMax(arr);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
        
    }
    public static int[] findMinAndMax(int arr[]){
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min,max};
    }
}