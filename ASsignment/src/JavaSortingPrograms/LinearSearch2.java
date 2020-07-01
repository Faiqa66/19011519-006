package JavaSortingPrograms;
import java.util.Scanner;
public class LinearSearch2 {
@SuppressWarnings("resource")
public static void main(String...args) {
	Scanner sc=new Scanner(System.in);
	int c,n,search,arr[];
	System.out.println("Enter number of elements:");
	n=sc.nextInt();
	arr=new int[n];
	
	System.out.println("Enter those "+n+" number of elements:");
	
	for(c=0;c<n;c++) 
		arr[c]=sc.nextInt();
	
	System.out.println("Enter an element you want to find:");
	search=sc.nextInt();
	
	for(c=0;c<n;c++) {
		if(arr[c]==search) {
			System.out.println(search+"  search is present at the location"+(c+1));
			break;
		}
	}
	if(c==n) {
		System.out.println(search+"  search is not present in an array!");
	}
	
}
}
