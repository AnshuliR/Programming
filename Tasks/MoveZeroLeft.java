import java.util.Arrays;

public class MoveZeroLeft {
    public static void main(String[] args) {
        int [] a = {10,0,8,2,0,4,0,1};
        int [] b = new int[a.length];
        int k = a.length-1;
        for (int i = a.length-1; i >= 0; i--) {
            if (a[i] != 0) {
                b[k--] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
