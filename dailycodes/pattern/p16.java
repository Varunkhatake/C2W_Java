class P16{
	public static void main(String s[]){
		int num = 1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=3; j++){
				if(i%2==1){
					System.out.print(num + " ");
				}
				else{
					int k = num+64;
					System.out.print((char)k + " ");
				}
				num++;
			}
			System.out.println();
		}
	}
}

