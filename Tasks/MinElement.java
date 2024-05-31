public class MinElement {
    public static void main(String[] args) {
        int [] arr = {10,20,30,5,40,50};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}
