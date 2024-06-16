import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			int num = 1;

			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
			}

			for(int j=1; j<=(row-i)*2+1; j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
