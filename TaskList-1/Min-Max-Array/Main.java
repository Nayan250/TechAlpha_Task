/*
	Definition:-Maximum And Minimum Number From Array
	Code Written By:-Nayan Makwana
*/
import java.util.Scanner;
class Main{
	static int minValArray(int a[],int n){
		int min=a[0];
		for(int i=0;i<n;i++){
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	static int maxValArray(int a[],int n){
		int max=a[0];
		for(int i=0;i<n;i++){
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	static void showArray(int a[],int n){
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
	}
	public static void main(String a[]){
		Scanner s=new Scanner(System.in);
		int n,min,max;
		System.out.print("Enter size of an array :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter " + n + " values :");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		min=minValArray(arr,n);
		max=maxValArray(arr,n);
		System.out.println("Array is :");
		showArray(arr,n);
		System.out.println("\nMinimum value from an array is :" + min);
		System.out.println("Maximum value from an array is :" + max);
	}
}