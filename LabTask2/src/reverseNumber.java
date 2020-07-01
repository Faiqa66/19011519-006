class reverseNumber{
	static int reverse(int n) {
		int rev=0;
		while(n!=0) {
			rev=(rev*10)+(n%10);
			n/=10;
		}
		System.out.println("Reverse of number:"+rev);
		return rev;
	}
	static void getSum(int n) {
		n=reverse(n);
		int sumOdd=0;
		int sumEven=0;
		@SuppressWarnings("unused")
		int c=1;
		while(n!=0) {
			if(n%2==0)
				sumEven+=n%10;
			else
				sumOdd+=n%10;
			n/=10;
			c++;
		}
		System.out.println("Sum of odds:"+sumOdd);
		System.out.println("Sum of evens:"+sumEven);
	}
	public static void main(String[]args) {
		int n=456789;
		getSum(n);
	}
}
