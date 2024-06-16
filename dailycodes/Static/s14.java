class S14{
	int x = 30;
	static int y = 40;

	void fun(){
		System.out.println("in fun");
	}

	static void run(){
		System.out.println("int run");
	}

	public static void main(String s[]){
		S14 obj = new S14();

		System.out.println(x);
		System.out.println(obj.y);

		fun();
		obj.run();
	}
}


