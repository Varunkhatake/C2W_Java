class C8{
	public static void main(String[] args){
		int num1 = 0;
		int num2 =0;
		int multi = 0;
		if(num1>=0 && num2>=0){
			multi=num1*num2;
		}else{
			System.out.println("Sorry negative numbers not allowed");
		}
		switch(multi%2){
			case 0:
				System.out.println("multiplication of numbers is even");
				break;
			default:
				System.out.println("multiplication of numbers is odd");
				break;
			}
	}
}

