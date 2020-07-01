package JavaSortingPrograms;
import java.util.Scanner;
public class LinearSearch {
public static int linearSrch(int[] arr,int key) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			return i;
	}
}

      return -1;
}
public static void main(String...args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
         int arr1[]= {30,90,60,40,50};
         System.out.println("Enter the key word you want to find:");
         int key=sc.nextInt();
         System.out.println(key+" is found at the index "+linearSrch(arr1,key));
}
}
