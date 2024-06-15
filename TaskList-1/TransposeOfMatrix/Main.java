/*
	Definition:-Transpose of matrix
	Code Written By:-Nayan Makwana
*/
import java.util.Scanner;
class Main{
	static int[][] transposeMatrix(int t[][],int r,int c){
		int trans[][]=new int[c][r];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				trans[j][i]=t[i][j];
			}
		}
		return trans;
	}
	static void showMatrix(int t[][],int r,int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		int r,c;
		System.out.print("Enter row for matrix :");
		r=s.nextInt();
		System.out.print("Enter column for matrix :");
		c=s.nextInt();
		int t[][]=new int[r][c];
		System.out.println("Enter " + (r*c) + " values for " + r + "X" + c + " matrix :");
		for(int i=0;i<r;i++){
			System.out.println("Enter values for row :" + (i+1));
			for(int j=0;j<c;j++){
				t[i][j]=s.nextInt();
			}
			System.out.println();
		}
		System.out.println("Your matrix :");
		showMatrix(t,r,c);
		int trans[][]=transposeMatrix(t,r,c);
		System.out.println("Transpose matrix :");
		showMatrix(trans,c,r);
	}
}