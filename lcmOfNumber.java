public class lcmOfNumber {
    public static void main(String[] args) {
        int a=36,b=60,lcm=0;
        int max=Math.max(a, b);
        for(int i=max;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
