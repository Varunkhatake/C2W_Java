class P4{
	public static void main(String s[]){
		int i=1;
		char ch = 'A';

		while(i<=6){
			if(i%2==1){
				System.out.print(ch++ + " ");
			}
			else{
				System.out.print(i + " " );
			}
			i++;
		}
	}
}

