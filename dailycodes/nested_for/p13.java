class P13{
	public static void main(String s[]){
		int num;
		int row = 3;
		num=row*row;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}
}

