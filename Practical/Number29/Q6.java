import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int add = 0;
		for(int i=1; i<=num; i++){

		
			System.out.print(add + " ");
			add = num1+num2;
			num2=num1;
			num1=add;
		}
	}
}

