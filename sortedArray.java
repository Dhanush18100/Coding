public class sortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4};
        boolean isSorted=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
