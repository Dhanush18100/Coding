import java.util.HashMap;

public class NonReapitingCharacter {
    public static void main(String[] args) {
        String str="swiss";
        HashMap<Character,Integer>freq=new HashMap<>();
        for(char c:str.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        System.out.println("Non repeating characters: ");
        for(char c :str.toCharArray()){
            if(freq.get(c)==1){
                System.out.println(c+" ");
            }
        }
    }
}
