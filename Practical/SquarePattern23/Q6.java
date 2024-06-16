import java.util.*;

class Q6{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		

		for(int i=1; i<=row; i++){
			int num = row*row;
			int num2 = 5;
			for(int j=1; j<=row; j++){

				if(i%2==1){
					System.out.print(num + " ");
					num--;
				}
				else if(i%2==0 && j%2==0){
					num = num - num2;
					System.out.print(num +" ");
					
					
				}
				else if(i%2==0 && j%2==1){
					
					System.out.print(num + " ");
				}
				
		
			}

			System.out.println();
		}
	}
}

