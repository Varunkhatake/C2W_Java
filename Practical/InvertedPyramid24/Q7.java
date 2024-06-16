import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			

			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
			}
			char ch = 'A';

			for(int j=1; j<=(row-i)*2+1; j++){
				if(j<row-i+1){
					System.out.print(ch+++" ");
				}
				else{
					System.out.print(ch--+" " );
				}

				
			}
			System.out.println();
			ch++;
		}
	}
}
