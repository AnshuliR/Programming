import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size : ");
        byte size = s.nextByte();
        byte arr[] = new byte[size];
        byte choice;

        do{System.out.println("1. for adding\n2.for exit");
        choice = s.nextByte();
            switch (choice) {
                case 1:
                System.out.print("Enter the index : ");
                byte idx = s.nextByte();
                System.out.print("Enter the value : ");
                byte value = s.nextByte();
                    arr[idx]=value;
                    break;
            case 2 :
                break;

            default:
                    break;
            }
        }    while(choice!=2);
            System.out.print("Array : ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
