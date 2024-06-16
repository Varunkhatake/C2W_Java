import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		
		int count = 0;

		for(int i=1; i<=row; i++){
			int ch = row+64;
			int num= 1;
			ch = ch-count;

			for(int j=row; j>=i; j--){

				if(i%2==1){
					System.out.print(num++ + " ");
				}
				else{
					System.out.print((char)ch-- +" ");
				}
			}
			System.out.println();
			count++;
		}
	}
}

