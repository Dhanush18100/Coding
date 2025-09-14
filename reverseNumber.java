public class reverseNumber{
    public static void main(String[] args) {
        int n=-123;
        int reverse=0;
        while(n!=0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        int result=reverse;
        if(n<0){
            result=reverse*(-1);
        }
        System.out.println(result);
    }
}