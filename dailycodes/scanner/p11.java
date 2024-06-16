import java.util.*;
class P11{
	public static void main(String s[]){

		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);;

		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}

