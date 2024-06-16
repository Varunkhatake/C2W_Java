class P2{
	public static void main(String s[]){
		int num = 2569185;
		int rem;
		System.out.print("digit not divisible by 3 are: ");

		while(num>0){

			rem=num%10;

			if(rem%3!=0){
				System.out.print(rem + " ");
			}
			num=num/10;
		}
	}
}

