class P10{
	public static void main(String s[]){
		int row = 3;
		
		int count = 0;

		for(int i=1; i<=row; i++){
			int num = 1;
			num = num +count;
			for(int j=1; j<=row; j++){
				System.out.print(num++ + " ");
			
			}
			count++;
			System.out.println();
		}
	}
}



