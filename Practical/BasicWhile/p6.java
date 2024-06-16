class P6{
	public static void main(String s[]){
		char ch = 'A';

		while(ch<='Z'){

			if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
				System.out.print(ch + " ");
			}
			ch++;
		}
	}
}

