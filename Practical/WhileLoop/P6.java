class P6{
	public static void main(String s[]){
		int num=9307;
		int rem;

		while(num>0){

			rem=num%10;
			num=num/10;

			System.out.println(rem);
		}
	}
}

