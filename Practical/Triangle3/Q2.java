import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int num=2;
		for(int i=1; i<=row; i++){
			for(int j=row; j>=i; j--){
				System.out.print(num + " ");
				num+=2;
			}
			System.out.println();
		}
	}
}

