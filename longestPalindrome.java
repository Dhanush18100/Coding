public class longestPalindrome {
    public static void main(String[] args) {
        String[] words = {"racecar", "level", "hello", "madam", "world"};
        String result = longest(words);
        System.out.println("Longest palindrome: " + result);
    }
    public static boolean isPalindrome(String str){
        int left =0 ,right=str.length()-1;
        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static String longest(String[] arr){
        String longest="";
        for(String word:arr){
            if(isPalindrome(word)&&word.length()>longest.length()){
                longest=word;
            }
        }
        return longest;
    }
    
}
