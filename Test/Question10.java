package Test;

public class Question10 {
    public static void main(String[] args) {
        
        int a[] = {23,44,12,1,55,6};
        int search=55;

        for(int i = 0; i<a.length-1;i++){
            for(int j=i+1; j<a.length;j++){
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        int start = 0, end = a.length-1, mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(search == a[mid]){
                System.out.println(search+" is present at index "+mid);
                break;
            }
            else if(search<a[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
    }
}
