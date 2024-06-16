class P4{
	public static void main(String s[]){
		int num = 1;

		for(int i=1; i<=6; i++){
			if(i%2==0){
				System.out.print(num*num*num + " ");
			}
			else{
				System.out.print(num + " ");
			}
			num++;
		}
	}
}

