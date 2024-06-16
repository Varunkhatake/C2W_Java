class S4{
	void fun(){
		System.out.println("In fun method");
	}

	static void run(){
		System.out.println("In run method");
	}

	public static void main(String s[]){
		System.out.println("In main Method");
		S4.run();
	}
}

