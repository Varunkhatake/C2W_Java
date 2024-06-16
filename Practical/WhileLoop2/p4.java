class P4{
	public static void main(String s[]){
		int num=256985;
		int rem;

		while(num>0){
			rem=num%10;

			if(rem%2==1){
				System.out.print(rem*rem + " ");
			}
			num=num/10;
		}
	}
}

