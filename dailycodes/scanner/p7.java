import java.util.*;
class P7{
	public static void main(String s[]){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=9; i++){
			System.out.print(num-- + " ");
		}
	}
}

