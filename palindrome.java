public class palindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPalindrome(s));
        
    }
    public static boolean isPalindrome(String s){
        String original=s;
        char arr[]=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String reverse=new String(arr);
        if(original.equals(reverse)){
            return true;
        }
        return false;
    }
}
