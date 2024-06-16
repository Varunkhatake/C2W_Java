class P12{
	public static void main(String s[]){
		int num;
		int row = 4;

		for(int i=1; i<=row; i++){
			num=row;
			for(int j=1; j<=row; j++){
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}
}

