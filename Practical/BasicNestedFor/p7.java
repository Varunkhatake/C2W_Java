class P7{
	public static void main(String s[]){
		int row = 3;
		

		for(int i=1; i<=row; i++){
			char ch = 'a';
			for(int j=1; j<=row; j++){
				int c1 = ch+row;
				System.out.print((char)--c1 + " ");
				ch--;
				
			}
			
			System.out.println();
		}
	}
}
