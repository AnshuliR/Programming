public class FirstLast {
    public static void main(String[] args) {
        char [] c = {'a','b','c','d','e'};

        for(int i =0;i<c.length;i++){
            if(i==0||i==c.length-1){
                System.out.println(c[i] + "\t");
            }
        }
    }
}
