class P6{
	public static void main(String s[]){
		int num = 1;
		for(int i=1; i<=9; i++){
			if(i%2==0){
				System.out.print(num + " ");
			}
			else{
				int k = num+64;
				System.out.print((char)k + " ");
			}
			num++;
		}
	}
}

