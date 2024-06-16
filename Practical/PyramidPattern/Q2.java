import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int num = 1;

		for(int i=1; i<=row; i++){

			for(int sp=row; sp>i; sp--){
				System.out.print(" "+ " " );
			}
			for(int j=1; j<=i*2-1; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}


