package SortingArray;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {1,3,7,5,4,9,0};
        for(int i = 0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                if (a[i]<a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int c = 0;
        for(int i = 0; i<a.length;i++){
            c++;
            if(c==3){
                System.out.println("Third max element = "+a[i]);
                break;
            }
        }
    }
}
