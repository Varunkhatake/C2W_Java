import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			char ch = 'A';
			for(int sp=row; sp>i; sp--){
				System.out.print(" "+" ");
				ch++;
			}
			for(int j=1; j<=i*2-1; j++){
				if(j<i){
					System.out.print(ch+" ");
					ch++;
				}
				else{
					System.out.print(ch+" ");
					ch--;
				}
			}
			System.out.println();
		}
	}
}

