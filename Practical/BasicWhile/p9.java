class P9{
	public static void main(String s[]){
		int num = 0;

		int i = 150;

		while(i>=101){

			if(i%2==1){
				num=num+i;
			}
			i--;
		}
		System.out.print(num + " ");
	}
}

