import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int num=row;

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
			}
			
			for(int j=row; j>=i; j--){
				System.out.print(num + " ");
			}
			num--;
			System.out.println();
		}
	}
}

