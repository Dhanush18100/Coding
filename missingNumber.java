public class missingNumber {
    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        int actual_sum=0,total_sum=0;
        for(int i=1;i<=arr.length+1;i++){
            total_sum+=i;
            
        }
        for(int i=0;i<arr.length;i++){
            actual_sum+=arr[i];
        }
        System.out.println(total_sum-actual_sum);
    }
}
