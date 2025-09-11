public class maxDiff {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int minVal=arr[0];
        int maxVal=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-minVal>maxVal){
                maxVal=arr[i]-minVal;
            }
            if(arr[i]<minVal){
                minVal=arr[i];
            }
        }
        System.out.println("Maximum Difference: " + maxVal);
    }
}
