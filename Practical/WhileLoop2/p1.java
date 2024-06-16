class P1{
	public static void main(String s[]){
		int num = 2569185;
		int rem;
		System.out.print("digit dividsible by 2 are: ");

		while(num>0){

			rem=num%10;

			if(rem%2==0){
				System.out.print(rem + " ");
			}
			num=num/10;
		}
	}
}
