import java.util.Arrays;

public class rankOfArray {
    public static void main(String[] args) {
         int[] arr = { 100, 2, 70, 12 , 90};
 
        // Function Call
        changeArr(arr);
 
        // Print the array elements
        System.out.println(Arrays.toString(arr));
        
    }
     static void  changeArr(int input[]){
        int newInt[]=Arrays.copyOfRange(input, 0,input.length);
        Arrays.sort(newInt);
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                if(input[i]==newInt[j]){
                    input[i]=j+1;
                    break;
                }
            }
        }

    }
}
