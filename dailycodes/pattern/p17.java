class P17{
	public static void main(String s[]){
		for(int i=1; i<=4; i++){
			int num = 1;
                	int temp = num+3;
			
			for(int j=1; j<=4; j++){
				
				if(i%2==1){
					System.out.print(num++ + " " );
				}
				else{
					
					System.out.print(temp-- + " ");
				}
			}
			System.out.println();
		}
	}
}

