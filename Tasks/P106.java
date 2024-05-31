public class P106{
    public static void main(String[] args) {
        char a[]={'A','B','c','d','e','F'};
        for(int i=0;i<a.length;i++){
            char c=a[i];
            if(c>=97&&c<=122){
                c-=32;
                a[i]=c;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}