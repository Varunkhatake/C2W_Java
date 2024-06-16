class P8{
	public static void main(String s[]){
		int num = 9;

		for(int i=1; i<=9; i++){
			if(i%2==0){
				int k = i+64;
				System.out.print((char)k + " ");
			}
			else{
				System.out.print(num + " ");
			}
			num--;
		}
	}
}

