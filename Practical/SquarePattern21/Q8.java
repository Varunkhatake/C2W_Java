import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		int num=row;
		
		for(int i=1; i<=row; i++){
			int ch = row+64;
			
			for(int j=1; j<=row; j++){
				if(i%2==1 && j%2==0){
					
					System.out.print((char)ch + "\t");
					ch--;
				}
				else if(i%2==0 && j%2==1){
					System.out.print((char)ch+ "\t");
					ch--;
				}
				else{
					System.out.print("#"+"\t");
				}

				
			}
			System.out.println();
		}
	}
}

