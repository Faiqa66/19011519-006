class DigitSum{
	static int reverse(int n) {
		int rev=0;
		
		while(n!=0) {
			rev=(rev*10)+n%10;
			n/=10;
		}
		return rev;
	}
	static void getSum(int n) {
		int oddSum=0;
		int evenSum=0;
		int c=1;
		while(n!=0) {
			if(c%2==0) {
				n=n%10;
				evenSum=n+evenSum;
		}
			else
			{
				n=n%10;
				oddSum=n+oddSum;
			}
			System.out.println("Sum of even numbers:"+evenSum);
			System.out.println("Sum of odd numbers:"+oddSum);
	}
	}
	public static void main(String[] args) {
	int n=456789;
	getSum(n);
	}
}
