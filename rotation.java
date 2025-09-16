import java.util.Arrays;

public class rotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
        int index=0;
        int res[]=new int[arr.length];
        for(int i=k;i<arr.length;i++){
            res[index++]=arr[i];
        }
        for(int i=0;i<k;i++){
            res[index++]=arr[i];
        }
System.out.println(Arrays.toString(res));
    }
}
