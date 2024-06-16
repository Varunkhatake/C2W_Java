class P9{
	public static void main(String s[]){
		int num = 214367689;
		int ctr1 = 0;
		int ctr2 = 0;
		int rem;

		while(num>0){
			rem = num%10;
			num = num/10;

			if(rem%2==1){
				ctr1++;
			}
			else{
				ctr2++;
			}
		}
		System.out.println("Odd count: "+ctr1);
		System.out.println("even count: "+ctr2);
	}
}
