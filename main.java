import java.util.Scanner;
import java.lang.String;

class Main{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);

		long x11, x12, x13;
	    long x21, x22, x23;
		long x31, x32, x33;
			    
		long y11, y12, y13;
		long y21, y22, y23;
		long y31, y32, y33;
		long n;
		
		short matrix_size = scan.nextShort();

		if(matrix_size > 2){

		}

		short choose;

		long[][] matrix = new long[2][2];
		long[][] matrix1 = new long[2][2];
		
		System.out.println("Choose action(0 - +, 1 - -. 2 - *, 3 - /, 4 - X * N):");
		choose = scan.nextShort();

		System.out.println("Enter first line x:");
		x11 = scan.nextLong();
		x12 = scan.nextLong();
		
		System.out.println("Enter second line x:");
		x21 = scan.nextLong();
		x22 = scan.nextLong();

		System.out.println("Enter first line y:");
		y11 = scan.nextLong();
		y12 = scan.nextLong();
		
		System.out.println("Enter second line y:");
		y21 = scan.nextLong();
		y22 = scan.nextLong();

		matrix[0][0] = x11;
		matrix[0][1] = x12;
		//matrix[0][2] = x13;

		matrix[1][0] = x21;
		matrix[1][1] = x22;
		//matrix[1][2] = x23;

		//matrix[2][0] = x31;
		//matrix[2][1] = x32;
		//matrix[2][2] = x33;

		matrix1[0][0] = y11;
		matrix1[0][1] = y12;
		//matrix1[0][2] = y13;

		matrix1[1][0] = y21;
		matrix1[1][1] = y22;
		//matrix1[1][2] = y23;

		//matrix1[2][0] = y31;
		//matrix1[2][1] = y32;
		//matrix1[2][2] = y33;

		for(int i = 0; i < matrix_size; i++){
		
			for(int j = 0; j < matrix_size; j++){

				switch(choose){
					case 0:
						System.out.print(matrix[i][j] + matrix1[i][j] + " ");
						break;
					case 1:
						System.out.print(matrix[i][j] - matrix1[i][j] + " ");
						break;
					case 2:
						System.out.print(matrix[i][j] * matrix1[i][j] + " ");
						break;
					case 3:
						System.out.print(matrix[i][j] / matrix1[i][j] + " ");
						break;
				}
			}
			System.out.println(" ");
		}
	} 
}

