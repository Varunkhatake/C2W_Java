class P6{
	public static void main(String s[]){
		int row = 4;

		for(int i=1; i<=row; i++){
			int num = 1;
                	char ch = 'A';
			for(int j=1; j<=row; j++){
				System.out.print(num++ + "" + ch++ + " ");
			}
			System.out.println();
		}
	}
}

