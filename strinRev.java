public class strinRev {
    public static void main(String[] args) {
        String s="Hello WOrld!";
        char ans[]=s.toCharArray();
        int start=0;
        int end=ans.length-1;
        while(start<=end){
            char temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
        System.out.println(ans);

    }
}
