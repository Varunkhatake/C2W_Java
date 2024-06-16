import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			int num=1;
			for(int sp=row; sp>i; sp--){
				System.out.print(" "+" ");
			}
			for(int j=1; j<=i*2-1; j++){
				if(j<i){
					System.out.print(num + " ");
					num++;
				}
				else{
					System.out.print(num + " ");
					num--;
				}
			}
			System.out.println();
		}
	}
}

