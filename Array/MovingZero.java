package Array;

public class MovingZero {
    public static void main(String[] args) {
        int ar[] = {0,1,0,3,12};
        for(int i=0; i<ar.length;i++){
            if(ar[i]==0){
                ar[i]=ar[i+1];
            }
        }
        for(int i=0; i<ar.length;i++){
            System.out.println(ar[i]);
        }
        
    }
    
 }
