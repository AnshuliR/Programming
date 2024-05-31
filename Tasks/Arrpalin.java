package Tasks;

public class Arrpalin {
    public static void main(String[] args) {
        char c [] = {'n','i','t','i','n'};
        int start =0,end=c.length-1;
        boolean flag = true;
        for(;start<end;start++,end--){
            if(c[start]!=c[end] && start!=end){
            flag = false;
            break;
        }
        }
        if(flag== false)
        System.out.println("not palindrome");
        else
        System.out.println("palindrome");
        }
    
    }
