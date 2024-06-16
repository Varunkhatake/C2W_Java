import java.util.*;

class Q1{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		int num = 1;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				System.out.print(num++ + " " );
			}
			System.out.println();
		}
	}
}

