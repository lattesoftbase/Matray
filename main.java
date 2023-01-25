import java.util.Scanner;
import java.lang.String;

class Main{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);

		long x11, x12;
	    long x21, x22;
		//long x31, x32, x33, x23, x13;	
			    
		long y11, y12, y13;
		long y21, y22, y23;
		long y31, y32, y33;
		
		long n;
		
		short matrix_size = 2;
		short choose;

		long[][] matrix = new long[3][3];
		
		//long matrix[matrix_size][matrix_size] = new long{{x11, x12, x13}, {x21, x22, x23}, {x31, x32, x33}};
    	//long matrix1[matrix_size][matrix_size] = new long{{y11, y12, y13}, {y21, y22, y23}, {y31, y32, y33}};
		
		System.out.println("Choose action(0 - +, 1 - -. 2 - *, 3 - /, 4 - X * N):");
		choose = scan.nextShort();

		System.out.println("Enter first line x:");
		x11 = scan.nextLong();
		x12 = scan.nextLong();
		
		System.out.println("Enter second line x:");
		x21 = scan.nextLong();
		x22 = scan.nextLong();

		matrix[0][0] = x11;
		matrix[0][1] = x12;
		//matrix[0][2] = x13;

		matrix[1][0] = x21;
		matrix[1][1] = x22;
		//matrix[1][2] = x23;

		//matrix[2][0] = x31;
		//matrix[2][1] = x32;
		//matrix[2][2] = x33;

		for(int i = 0; i < matrix_size; i++){
		
			for(int j = 0; j < matrix_size; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	} 
}

