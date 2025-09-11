import java.util.Arrays;

public class secondLargetElement {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,6};
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondLarget=-1;
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]!=largest){
                secondLarget=arr[i];
                break;
            }
            
        }
        System.out.println(secondLarget);
        }

}
