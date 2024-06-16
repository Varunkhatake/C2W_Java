import java.util.*;

class Q5{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		int ch = row+64;
		int num = row;
		

		for(int i=1; i<=row; i++){
			
			
			for(int j=1; j<=row; j++){

				if(i%2==1 && j%2==1){
					
					System.out.print(num++ + " ");
				}
				else if(i%2==1 && j%2==0){
					
					System.out.print("$" +" ");
				}
				else if(i%2==0){
					

                                        System.out.print(num +" ");
                                }
				
			}
			System.out.println();
			
		
			
		}
	}
}

