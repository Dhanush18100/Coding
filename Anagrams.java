import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1="silent";
        String s2="listen";
        char []res1=s1.toCharArray();
        char []res2=s2.toCharArray();
        Arrays.sort(res1);
        Arrays.sort(res2);
        if(Arrays.equals(res1, res2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not a anagram");
        }
    }
}
