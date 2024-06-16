import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++){
			int num = 1;
			char ch = 'a';
			int num2 = 1;
			for(int j=row; j>=i; j--){
				if(num2%2==0){
					System.out.print(ch++ + " ");
				}
				else{
					System.out.print(num++ + " ");
				}
				num2++;
			}
			System.out.println();
		}
	}
}

