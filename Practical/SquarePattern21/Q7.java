import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int num=row;
		char ch = 'A'; 
		
		for(int i=1; i<=row; i++){
			
			for(int j=1; j<=row; j++){
				if(num%2==1){
					
					System.out.print(ch + "\t");

				}
				else{
					System.out.print(num + "\t");
					
				}
				num++;
				
			}
			System.out.println();
			ch++;
		}
	}
}

