import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++){
			char ch = 'A';
			char ch1 = 'a';

			for(int j=row; j>=i; j--){
				if(i%2==1){
					
					System.out.print(ch++ + " ");
				}
				else{
					System.out.print(ch1++ + " ");
				}
			}
			System.out.println();
		}
	}
}

