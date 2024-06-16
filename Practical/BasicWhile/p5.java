class P5{
	public static void main(String s[]){
		int day = 7;

		while(day>=0){

			if(day != 0){
				System.out.println(day + " days remaining");
			}
			else{
				System.out.println(day + " days Assignment is Overdue");
			}
			day--;
		}
	}
}

