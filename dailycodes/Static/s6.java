class S6{
	void fun(){
		System.out.println("in fun method");
	}

	static void run(){
		System.out.println("in run method");
	}
	public static void main(String s[]){
		System.out.println("in main method");
		S6 obj = new S6();
		obj.fun();
		run();
	}
}

