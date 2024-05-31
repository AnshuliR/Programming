public class TwoArray{
    public static void main(String[] args) {
		byte [] arr1 = {1,2,3,4,5};
        
		byte [] arr2 = new byte[arr1.length];
		byte j = 0;
		
		System.out.print("First array : ");
		System.out.println(arr1);
		for(byte i =0;i<arr1.length;i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		for(int i = arr1.length-1;i>=0;i--,j++) {
		arr2[j] = arr1[i]; 
	}
		System.out.print("\nSecond array : ");
		System.out.println(arr2);
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i] + "\t");
	}
}
} 