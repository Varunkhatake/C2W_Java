import java.util.*;

class Q10{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){
			int ch = row+64;
			int num = row;
			for(int j=1; j<=row; j++){
				if(i%2==1 && j%2==1){
					
					System.out.print(num + "\t");
				}
				else{
					System.out.print((char)ch + "\t");
					
				}
				num--;
				ch--;
				
			}
			System.out.println();
		}
	}
}

