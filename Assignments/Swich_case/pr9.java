class C9{
	public static void main(String[] args){
		int sub1=50;
		int sub2=50;
		int sub3=50;
		int sub4=50;
		int sub5=50;
	        double  total =0;
		if(sub1>=45 && sub1<=100 && sub2>=45 && sub2<=100 && sub3>=45 && sub3<=100 && sub4>45 && sub4<=100 && sub5>=45 && sub5<=100){
			total=sub1+sub2+sub3+sub4+sub5;
		}else{
			System.out.println("You failed");
		}
		double grade = (total/500)*100;
		int num = 0;
		if(grade >= 75) {
			num = 1;
		}else if(grade >=65 && grade< 75){
			num = 2;
		}else if(grade <65 && grade >=55){
			num = 3;
		}else if(grade <55 && grade >=45){
			num = 4;
		}
		switch(num){
			case 1:
				System.out.println("First class with distiction");
				break;
			case 2:
				System.out.println("First class");
				break;
			case 3:
				System.out.println("Second class");
				break;
			case 4:
				System.out.println("Third class");
				break;
			default:
				System.out.println("Fail");
			}
	}
}



