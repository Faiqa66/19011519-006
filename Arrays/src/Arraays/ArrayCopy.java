package Arraays;

public class ArrayCopy {
public static void main(String...args) {
	int arr1[]= {12,22,32,42,52};
	int arr2[]=new int[arr1.length];
	
	for(int i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	
	System.out.println("Original array of elements:");
	for(int i=0;i<arr1.length;i++) {
		System.out.print(arr1[i]+" ");
	}
	System.out.println();
	
	System.out.println("Elements of new array:");
	for(int i=0;i<arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}
}
}
