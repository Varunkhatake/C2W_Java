class P3{
	public static void main(String s[]){
		int num = 436780521;
		int rem;
		System.out.print("digit divisible by 3 or 2 are: ");

		while(num>0){
			rem=num%10;

			if(rem%2==0 || rem%3==0){
				System.out.print(rem + " ");
			}
			num=num/10;
		}
	}
}

