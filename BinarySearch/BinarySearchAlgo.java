package BinarySearch;

import java.util.Scanner;

//constraints: 1.sorted array
             //TC=O(log n)   SC=O(1);


public class BinarySearchAlgo {
	
	//defining binary search function
	
	public static int binarySearch(int a[],int ele) {
		int left=0;
		int right=a.length-1;
		while(left<=right) {
			int mid=left+((right-left)/2);
			
			//agar value match kar gayi
			if(a[mid]==ele) return mid+1;
			
			//agar mid pe value choti thi key se
			else if(a[mid]<ele) left=mid+1;
			
			else right=mid-1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		//taking input
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sortedArr[]=new int[n];
		
		for(int i=0;i<sortedArr.length;i++)
			 sortedArr[i]=scn.nextInt();
		
		int key=scn.nextInt();
		
		//calling binary search function
		
		System.out.print(binarySearch(sortedArr,key));
		
		
	}

}
