import java.util.Scanner;
public class RotateImage {
    
        // TODO: Read n and n (dimensions)
        // TODO: Read the matrix elements
        // TODO: Rotate the matrix 90 degrees clockwise INPLACE
        // Hint: 1. Transpose the matrix. 2. Reverse each row.
        // TODO: Print the rotated matrix
    
	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int m= sc.nextInt();
		int n= sc.nextInt();

		int[][] mat= new int[m][n];


		for(int i=0;i<m;i++){

			for(int j=0;j<n;j++){

				mat[i][j]= sc.nextInt();

			}

		}
		for(int i=0;i<m;i++){

			for(int j=i+1;j<n;j++){

				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;

			}

		}
		for(int i=0;i<m;i++){

			for(int j=0;j<n/2;j++){

				int temp=mat[i][j];
				mat[i][j]=mat[i][n-j-1];
				mat[i][n-j-1]=temp;

			}

		}
		for(int i=0;i<n;i++){

			for(int j=0;j<m;j++){

				System.out.print(mat[i][j]);
				if(j!=n-1)System.out.print(" ");

			}
			System.out.println("");

		}

	}
}
