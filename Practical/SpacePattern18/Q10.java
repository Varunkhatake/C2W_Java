import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=65;
			int temp = row;
		
			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
				num++;
				temp--;
			}
			for(int j=row; j>=i; j--){
				
				if(temp%2==0){
					System.out.print(num+ " ");
				}
				else{
					System.out.print((char)num+" ");
				}
				num++;
				temp--;
			}
			System.out.println();
		}
	}
}


