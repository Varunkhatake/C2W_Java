class P10{
	public static void main(String s[]){
		int num = 9367924;
		int rem;
		int sum = 0;
		int prod = 1;

		while(num>0){
			rem=num%10;
			if(rem%2==1){
				sum=sum+rem;
			}
			else{
				prod=prod*rem;
			}
			num=num/10;
		}
		System.out.println("sum of odd digit: "+ sum);
		System.out.println("product of even digit: "+prod);
	}
}
