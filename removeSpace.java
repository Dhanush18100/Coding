public class removeSpace {
    public static void main(String[] args) {
        String s="Hello world";
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                res+=s.charAt(i);
            }

        }
        System.out.println(res);
    }
}
