public class Identical {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2 = {1,2,3,4,5,6,7,8,9};

        for(int i =0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                System.out.println("Array are not identical");
                break;
            }
        }
        System.out.println("Array are identical");
    }
}
