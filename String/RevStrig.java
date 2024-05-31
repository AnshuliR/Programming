package String;

public class RevStrig {
    public static void main(String[] args) {
        String s = "Hello Brother";
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        char c[] = rev.toCharArray();
        for(char i:c){
            System.out.print(i);
        }
        
    }
}
