import java.util.*;
class P5{
	public static void main(String s[]){

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		for(int i=1; i<=8; i++){
			System.out.print(ch++ + " ");
		}
	}
}

