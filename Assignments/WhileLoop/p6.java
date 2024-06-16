class P6{
	public static void main(String s[]){
		int num = 234;
		int rem;
		int prod = 1;

		while(num>0){
			rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.print(prod);
	}
}

