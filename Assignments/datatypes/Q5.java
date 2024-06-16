class Q5{
	public static void main(String s[]){
		byte date = 21;
		byte month = 12;
		int year = 2003;

		System.out.println("Date = "+ date);
		System.out.println("Month = "+ month);
		System.out.println("Year = "+year);

		int SecondInDay = 60*60*24;
	        System.out.println("Second In Day " +SecondInDay);

		int SecondInMonth = SecondInDay*30;
                System.out.println("Second In Month " +SecondInMonth);

		int SecondInYear = SecondInDay*365;
                System.out.println("Second In Year " +SecondInYear);
	}
}	
