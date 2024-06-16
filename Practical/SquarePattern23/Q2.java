import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		int ch = row+64;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){

				if(j<=row-i){
					int ch1 = ch+32;
					System.out.print((char)ch1 + " ");
				}
				else{
					
					System.out.print((char)ch +" ");
				}
				ch++;
			}
			System.out.println();
		}
	}
}

