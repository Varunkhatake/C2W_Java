import java.util.*;

class Q1{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int count = 0;

		for(int i=1; i<=row; i++){
			int num = 1;
			num = num+count;
			for(int j=row; j>=i; j--){
				System.out.print(num++ + " ");
			}
			count++;
			System.out.println();
		}
	}
}

