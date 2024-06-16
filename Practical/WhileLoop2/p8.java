class P8{
	public static void main(String s[]){
		int num = 256985;
		int rem;
		int prod = 1;

		while(num>0){
			rem=num%10;
			if(rem%2==1){
				prod=prod*rem;
			}
			num=num/10;
		}
		System.out.println(prod);
	}
}

