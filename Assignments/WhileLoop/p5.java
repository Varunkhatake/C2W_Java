class P5{
	public static void main(String s[]){
		int num = 216985;
		int rem;
		while(num>0){
			rem=num%10;


			if(rem%2==0){
				System.out.print(rem*rem*rem + " ");
			}
			num=num/10;
		}

	}
}

