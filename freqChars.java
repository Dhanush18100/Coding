public class freqChars {
    public static void main(String[] args) {
        String s="Hello";
        for(int i=0;i<s.length();i++){
            int count=0;
            char ch = s.charAt(i);
            if(s.indexOf(ch)<i){
                continue;
            }
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.println(s.charAt(i)+"--->"+count);
        }
    }
}
