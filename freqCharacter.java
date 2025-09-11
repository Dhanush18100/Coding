import java.util.HashMap;

public class freqCharacter {
    public static void main(String[] args) {
        String s="Hello";
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c, 0)+1);
        }
         System.out.println(freq);
    }
}
