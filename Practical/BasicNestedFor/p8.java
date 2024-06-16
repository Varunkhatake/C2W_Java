class P8{
	public static void main(String s[]){
		int row = 4;
		int num = 1;
		
		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				int ch = row + 64;
				System.out.print((char)ch + "" + num++ + " ");
			}
			System.out.println();
		}
	}
}
