import java.util.*;

class Q4{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){

				if(i%2==0 && j%2==0){
					System.out.print("$" + " ");
				}
				else{
					
					System.out.print("&" +" ");
				}
				
			}
			System.out.println();
		}
	}
}

