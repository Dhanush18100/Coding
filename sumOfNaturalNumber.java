public class sumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println(getNumber(10));
        
    }
    public static int getNumber(int n){
        if(n==0){
            return n;
        }
        return n+getNumber(n-1);
    }
}
