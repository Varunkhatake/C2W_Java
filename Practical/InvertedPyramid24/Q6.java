import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int ch = row+64;

		for(int i=1; i<=row; i++){
			

			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
			}

			for(int j=1; j<=(row-i)*2+1; j++){
				System.out.print((char)ch+" ");
			}
			System.out.println();
			ch--;
		}
	}
}
