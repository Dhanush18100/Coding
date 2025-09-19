public class binaryToDecimal {
    public static void main(String[] args) {
        int binary=1111;
        int n=0;
        int decimal=0;
        while(binary>0){
            int temp=binary%10;
            decimal+=temp*Math.pow(2,n);
            binary/=10;
            n++;
        }
        System.out.println(decimal);

        
    }
   
}
