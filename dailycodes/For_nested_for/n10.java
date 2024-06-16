class N10{
	public static void main(String s[]){
		for(int i=1; i<=4; i++){
			char ch = 'a';
			char ch1 = 'A';

			for(int j=1; j<=3; j++){
				
				if(i%2==1){
					System.out.print(ch++ + " ");
				}
				else{
					System.out.print(ch1++ + " ");
				}
			}
			System.out.println();
		}
	}
}

