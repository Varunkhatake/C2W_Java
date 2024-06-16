class S8{
	void methodFun(){
		System.out.println("in fun function");
	}

	void methodGun(){
		System.out.println("in gun method");
	}

	void methodRun(){
		System.out.println("in run function");
	}

	public static void main(String s[]){
		System.out.println("in main function");
		S8 obj = new S8();
		obj.methodFun();
		obj.methodGun();
		obj.methodRun();
	}
}

