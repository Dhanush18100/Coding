public class armStrong {
    public static void main(String[] args) {
         int n = 407, len;
      len = order(n);

    if (isArmStrong (n, len))
        System.out.println(n + " is armstrong");
    else
        System.out.println(n+ " is armstrong");

  }
    public static int order(int x){
        int length=0;
        while (x!=0) {
            length++;
            x/=10;
        }
        return length;
    }
    public static boolean isArmStrong(int n,int x){
        int sum=0,temp,rem=0;
        temp=n;
        while(temp!=0){
            rem=temp%10;
            sum+=(int)Math.pow(rem,x);
            temp/=10;
        }
        return n==sum;
    }
}
