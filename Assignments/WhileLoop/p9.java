class P9{
	public static void main(String s[]){
		int num = 2469185;
		int rem;
		int sq;
		int sum = 0;

		while(num>0){
			rem=num%10;
			if(rem%2==1){
				sq=rem*rem;
				sum=sum+sq;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
