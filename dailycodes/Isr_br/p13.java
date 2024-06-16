import java.util.*;
class P13{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int num;
		int row = sc.nextInt();
		num=row*row;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}
}

