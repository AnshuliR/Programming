package SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args) {

        int a[] = {2,54,34,6,7};
        int search = 34;
        for(int i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println(search+" found at index "+i);
            }
        }
    }
}
