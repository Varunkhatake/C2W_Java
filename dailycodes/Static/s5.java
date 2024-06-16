class S5{
	void fun(){
		System.out.println("In fun method");
	}

	static void run(){
		System.out.println("in run method");
	}

	public static void main(String s[]){
		System.out.println("in main method");
		run();
		fun();
	}
}

