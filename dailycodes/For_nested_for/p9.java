class P9{
	public static void main(String s[]){
		int num = 65;

		for(int i=1; i<=9; i++){
			if(i%2==1){
				System.out.print((char)num + " ");
			}
			else{
				int ch = num+32;
				System.out.print((char)ch + " ");
			}
			num++;
		}
	}
}

