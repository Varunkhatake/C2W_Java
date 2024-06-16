import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		char ch = 'A';

		for(int i=1; i<=row; i++){

			for(int sp=row; sp>i; sp--){
				System.out.print(" "+" " );
			}
			for(int j=1; j<=i*2-1; j++){

				if(i%2==0){
					System.out.print(ch +" ");
				}
				else{
					System.out.print(i+" ");
				}
			}
			ch++;
			System.out.println();
		}
	}
}



