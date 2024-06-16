class P7{
	public static void main(String s[]){
		int num=256985;
		int rem;
		int sum = 0;

		while(num>0){
			rem=num%10;
			if(rem%2==0){
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.print(sum + " ");
	}
}

