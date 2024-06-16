import java.util.*;

class Q9{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			int num = 65;
			int ch1 = num+32;

			for(int sp=row; sp>i; sp--){
				System.out.print(" "+" ");
			}

			for(int j=1; j<=i*2-1; j++){

				if(i%2==0){
					if(j<i){
						System.out.print((char)ch1 + " ");
						ch1++;
					}
					else{
						System.out.print((char)ch1 + " ");
						ch1--;
					}
				}
				else{
					if(j<i){
						System.out.print((char)num + " ");
						num++;
					}
					else{
						System.out.print((char)num + " ");
						num--;
					}
				}
			}
			System.out.println();
		}
	}
}

