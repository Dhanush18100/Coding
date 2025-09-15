public class numberOfZeros {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0 };
          int n = arr.length;
        int x = numberOfZero(arr, n);
        if (x == -1) {
            System.out.println("Count of zero is 0");
        }
        else {
            System.out.print("count of zero is ");
              System.out.println(n-x);
        }
    }
    public static int numberOfZero(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }

}