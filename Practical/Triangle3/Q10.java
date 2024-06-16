import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int count = 0;
		for(int i=1; i<=row; i++){
			int num = row;
			num = num - count;
			int ch = 64+num;
			int ch2 = 96+num;
			for(int j=row; j>=i; j--){
				if(num%2==0){
					System.out.print((char)ch-- +" ");
				}
				else{
					System.out.print((char)ch2-- + " ");
				}
			}
			count++;
			System.out.println();
		}
	}
}

				
			
