import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			
			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
				
			}
			int ch=row+64;
			for(int j=row; j>=i; j--){
				System.out.print((char)ch + " ");
				ch--;
			}
			System.out.println();
		}
	}
}

