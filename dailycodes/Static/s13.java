class S13{
	int x = 30;
	static int y = 40;


	void fun(){
		System.out.println("In fun");
	}

	static void run(){
		System.out.println("in run");
	}

	public static void main(String s[]){
		S13 obj = new S13();

		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}

