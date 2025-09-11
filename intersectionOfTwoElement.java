import java.util.ArrayList;
import java.util.HashSet;

public class intersectionOfTwoElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8};
        HashSet<Integer>ans=new HashSet<>();
        ArrayList<Integer>result=new ArrayList<>();

        for(int num:arr1){
            ans.add(num);
        }
        for(int num:arr2){
            if(ans.contains(num)){
                result.add(num);
                ans.remove(num);
            }
        }
        System.out.println("Intersection: " + result);
    }
}
