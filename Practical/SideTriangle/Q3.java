import java.util.*;

class Q3{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter row: ");
		int row = sc.nextInt();
		int col = 0;
		

		for(int i=1; i<row*2; i++){
			if(i<=row){
				col=i;
			}
			else{
				col--;
			}
			int num=col;
			for(int j=1; j<=col; j++){
				System.out.print(num-- + " ");
			}
			
			System.out.println();
		}
	}
}

