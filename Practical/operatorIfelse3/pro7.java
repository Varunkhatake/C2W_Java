class Pro7{
	public static void main(String s[]){
		int x = 10;
		
		if(x/2==0){
		   System.out.println(""+ x+1);
		}
	        else if(x/2==5){
			System.out.println(x);
		}
		else if(x%2==0){
                        System.out.println(x+2);
                }
		else{
			System.out.println(x++);
		}
	}
}


