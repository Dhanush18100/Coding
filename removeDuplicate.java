import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,1,3,4,2,11,4,5};
        HashSet<Integer>ans=new HashSet<>();
        for(int n:arr){
            if(!ans.contains(n)){
                ans.add(n);
            }
        }
        System.out.println(ans);
    }
}
