import java.util.*;

class Q7{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		int num = row;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){

				if(i%2==1 && j%2==1){
					System.out.print(num*num-1 + " ");
				}
				else{
					
					System.out.print(num*num +" ");
				}
				num++;
			}
			System.out.println();
		}
	}
}

