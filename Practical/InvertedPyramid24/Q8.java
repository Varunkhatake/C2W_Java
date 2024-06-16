import java.util.*;

class Q8{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		

		for(int i=1; i<=row; i++){
			

			for(int sp=1; sp<i; sp++){
				System.out.print(" "+" ");
			}

			for(int j=1; j<=(row-i)*2+1; j++){
				if(j%2==0){
					System.out.print(0 +" ");
				}
				else{
					System.out.print(1 +" ");
				}
			}
			System.out.println();
			
		}
	}
}
