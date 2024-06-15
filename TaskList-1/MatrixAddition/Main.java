/*
	Definition:-Addition Of Two Matrices
	Code Written By:-Nayan Makwana
*/
import java.util.Scanner;
class Main{
	static int[][] additionOfMatrices(int m1[][],int r1,int c1,int m2[][],int r2,int c2){
		int sum[][]=new int[r1][c1];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				sum[i][j]=m1[i][j]+m2[i][j];
			}
		}
		return sum;
	}
	static void showMatrix(int a[][],int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		int r1,c1,r2,c2;
		System.out.print("Enter row for matrix-1 :");
		r1=s.nextInt();
		System.out.print("Enter column for matrix-1 :");
		c1=s.nextInt();
		System.out.print("Enter row for matrix-2 :");
		r2=s.nextInt();
		System.out.print("Enter column for matrix-2 :");
		c2=s.nextInt();
		if(r1==r2 && c1==c2){
			int m1[][]=new int[r1][c1];
			int m2[][]=new int[r1][c2];
			System.out.println("Enter " + (r1*c1) + " values for " + r1 + "X" + c1 + " matrix-1:");
			for(int i=0;i<r1;i++){
				System.out.println("Enter values for row:" + (i+1));
				for(int j=0;j<c1;j++){
					m1[i][j]=s.nextInt();
				}
				System.out.println();
			}
			System.out.println("Enter " + (r2*c2) + " values for " + r2 + "X" + c2 + " matrix-2:");
			for(int i=0;i<r2;i++){
				System.out.println("Enter values for row:" + (i+1));
				for(int j=0;j<c2;j++){
					m2[i][j]=s.nextInt();
				}
				System.out.println();
			}
			int sum[][]=additionOfMatrices(m1,r1,c1,m2,r2,c2);
			System.out.println("Matrix-1 :");
			showMatrix(m1,r1,c2);
			System.out.println("Matrix-2 :");
			showMatrix(m2,r2,c2);
			System.out.println("Addition of matrix-1 and matrix-2 :");
			showMatrix(sum,r1,c1);
		}else{
			System.out.println("Matrix addition is not possible");
		}
	}
}