import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			char ch = 'A';
			
			for(int sp=1; sp<=row-i; sp++){
				System.out.print(" "+ " ");
				ch++;
			}

			for(int j=1; j<=i; j++){
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}


