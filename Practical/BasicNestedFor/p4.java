class P4{
	public static void main(String s[]){
		int row = 3;

		char ch = 'A';

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				System.out.print(ch + " ");
				ch+=2;
			}
			System.out.println();
		}
	}
}

