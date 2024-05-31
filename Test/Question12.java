package Test;
import java.util.Scanner;
class Question12{
    //wrong
    public static int sumOfNum(String s){
        int sum=0, num=0;
        boolean isNumber = false;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10+(c-'0');
                isNumber=true;
            }
            else{
                if(isNumber){
                    sum+=num;
                    num=0;
                    isNumber=false;
                }
            }
            if(isNumber){
                sum+=num;
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int res = sumOfNum(s);
        System.out.println(res);
        sc.close();
    }
}