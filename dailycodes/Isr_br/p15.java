import java.util.*;
class P15{
	public static void main(String s[]){
		Scanner sc  = new Scanner (System.in);
		int num = 1;
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			for(int j=1; j<=row; j++){
				if(j%2==0){
					int k = num+64;
					System.out.print((char)k + " ");
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

