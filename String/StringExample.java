package String;

public class StringExample {
    public static void main(String[] args) {
        String s = new String("Hello");
        String s1 = new String("Hello");

        System.out.println(s.equals(s1));
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s1.toLowerCase());
        System.out.println(s.toUpperCase());

        char c[] =  s.toCharArray();
        for(char i : c){
            System.out.print(i);
        }
        
    }
}
