public class automorphicNumber {
    public static void main(String[] args) {
        int n=4;
        int power=(int)Math.pow(n, 2);
        System.out.println(power);
        if(power%10==n){
            System.out.println(n+" is automorphic number");
        }else{
            System.out.println(n+" is not automorphic number");
        }
    }
}
