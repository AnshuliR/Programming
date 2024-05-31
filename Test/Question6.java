package Test;

public class Question6 {
    public static boolean isPangram(String str) {
        
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if ('A' <= c && c <= 'Z') {
                index = c - 'A';
            } else if ('a' <= c && c <= 'z') {
                index = c - 'a';
            } else {
                
                continue;
            }
            
            mark[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input.toLowerCase()); // Convert to lowercase for case-insensitive check
        if (result) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
}
