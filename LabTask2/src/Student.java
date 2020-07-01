import java.util.Scanner;

public class Student {

    private String name;
    private String rollNo;
    private  int n=7;
    private long marks[]=new long[n];
    
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public long[] getMarks() {
		return marks;
	}

	public void setMarks(long[] marks) {
		this.marks = marks;
	}

	public void getInformation() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your name:");
    	name=sc.next();
    	System.out.println("Enter your roll number:");
    	rollNo=sc.next();
    	for(int i=0;i<7;i++) {
    		System.out.println("Enter marks in subjects"+(i+1)+":");
    		marks[i]=sc.nextInt();
    	}
    }
    
    	public void showInformation() {
    		for(int i=0;i<3;i++) {
    		System.out.printf("Your information is following:");
    		System.out.printf("\n---------------------------------");
    		System.out.printf("\nYour name is: "+name);
    		System.out.printf("\nYour roll number is: "+rollNo);
    		System.out.printf("\nYour marks in different subjects are following:\n");
    		System.out.printf("\nUrdu :"+marks[0]);
    		System.out.printf("\nEnglish :"+marks[1]);
    		System.out.printf("\nMathematics:"+marks[2]);
    		System.out.printf("\nPhysics:"+marks[3]);
    		System.out.printf("\nChemistry:"+marks[4]);
    		System.out.printf("\nComputer Science:"+marks[5]);
    		System.out.printf("\nIslamic Studies:"+marks[6]);
    		System.out.printf("\n--------------------------------");
    	}
    	}
}
