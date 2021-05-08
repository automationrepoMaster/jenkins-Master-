package Single_Dimesnion_Arrays;

public class Int_array {

	public static void main(String[] args) {

		// Single dimension array
		int[] a = new int[6]; // Declaration of an array with 5 element

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;

		// Normal For Loop
		for (int i = 0; i <= 5; i++) {
			System.out.println(a[i]);
			System.out.println(a.length + "length of array");
		}
		
		// For Each Loop
		
		int b[] = new int [2];
		for(int i:b) {
			System.out.println(i + "for each Loop");
		}

	}

}
