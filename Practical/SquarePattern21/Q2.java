import java.util.*;

class Q2{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int num = row;
		
		for(int i=1; i<=row; i++){
	
			for(int j=1; j<=row; j++){
				if(num%3==0){
					System.out.print(num*3 + " ");
				}
				else if(num%5==0){
					System.out.print(num*5 + " ");
					
				}
				else{
					System.out.print(num + " ");
				}

				num++;
			}
			System.out.println();
		}
	}
}

