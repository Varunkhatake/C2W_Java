import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=1;
			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
				
			}
			for(int j=row; j>=i; j--){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}

