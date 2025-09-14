public class fibonaci {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" "+b);
        int n=10;
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
        }
    }
}
