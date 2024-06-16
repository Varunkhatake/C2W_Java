import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<=row-i; sp++){
				System.out.print(" "+ " ");
			}
			int num = row;
			for(int j=1; j<=i; j++){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}

