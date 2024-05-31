public class ProIdx {
    public static void main(String[] args) {
        int [] c = {1,2,3,4,5,6,7,8,9};
        int pro =1;
        for(int i =0;i<c.length;i++){
            if( i%2 != 0){
                pro *=i;
            }  
        }
        System.out.println(pro);
    }
}
