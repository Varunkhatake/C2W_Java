class P7{
	public static void main(String s[]){
		int num = 93079224;
		int cnt = 0;
		int rem;

		while(num>0){

			rem = num%10;
			num = num/10;

			cnt++;
		}
		System.out.println(cnt);
	}
}
