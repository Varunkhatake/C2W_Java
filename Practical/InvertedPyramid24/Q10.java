import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=row;
			
			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
				num--;
			}

			for(int j=1; j<=(row-i)*2+1; j++){
				if(j<row-i+1){
					System.out.print(num-- + " ");
				}
				else{
					System.out.print(num++ + " ");
				}

			}
			System.out.println();
			
		}
	}
}
