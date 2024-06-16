import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=row; i++){
			int num=row;
			num = num - count;
			int ch = 96+num;
			int num2 = 1;
			for(int j=row; j>=i; j--){
				if(num2%2==0){
					System.out.print((char)ch + " ");
				}
				else{
					System.out.print(num + " ");
				}
				num2++;
				ch--;
				num--;
			}
			count++;
			System.out.println();
		}
	}
}

