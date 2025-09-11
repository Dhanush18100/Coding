public class concatString {
    public static void main(String[] args) {
        String s1="ancd";
        String s2="abcd";
        if(s1.length()!=s2.length()){
            System.out.println("Not rotations");
        }else{
            String temp=s1+s2;
            if(temp.contains(s2)){
                 System.out.println("Strings are rotations of each other");
            } else {
                System.out.println("Not rotations");
            }

            
        }
    }
}
