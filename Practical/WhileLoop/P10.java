class P10{
	public static void main(String s[]){
		long num = 9307922405l;
		long sum = 0l;
		long rem = 0l;

		while(num>0){
			rem=num%10;
			num=num/10;
			sum = sum+rem;
		}
		System.out.println(sum);
	}
}
