package TWO_Dimension_Arrays;

public class Int_arrays_TWO_Dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[3][2];

		// Row 0 ----cols
		a[0][0] = 10;
		a[0][1] = 20;

		// Row 1 --- cols
		a[1][0] = 30;
		a[1][1] = 40;

		// Row 2 ===== cols

		a[2][0] = 50;
		a[2][1] = 60;

		// Classic for loop

		for (int i = 0; i <=2; i++) // for incrementing rows {
			for (int j = 0; j <=1; j++) {

				System.out.println(a[i][j] + "\n");
			}
		System.out.println();
		
		
		
		//Advacned for Loop
		
		for(int i[]:a) {
			for(int j:i) {
				
				System.out.print(j + "\s" +  "Advacned for loop"  + "\n");
			}
			System.out.println( ); // This is to give some space
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
