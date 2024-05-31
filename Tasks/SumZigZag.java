import java.util.Arrays;

public class SumZigZag {
    public static void main(String[] args) {
        int [] a = {10,20,30};
        int [] b = {40,50,60,70,80};
        int [] c = new int[a.length+b.length];
        int k = 0, sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) c[k++] = a[i];
            if (i < b.length) c[k++] = b[i];
            
        }
        System.out.println(Arrays.toString(c));
        for (int i : c) {
            sum += i;
        }
        System.out.println(sum);
    }
}
