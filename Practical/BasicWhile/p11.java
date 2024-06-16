class P11{
	public static void main(String s[]){
		char ch = 'A';

		while(ch<='Z'){
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				continue;
			}
			System.out.print(ch++ + " ");
		}
	}
}

