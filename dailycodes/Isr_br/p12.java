import java.util.*;
class P12{
	public static void main(String s[]){
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
                int num;
		for(int i=1; i<=row; i++){
			num=row;
			for(int j=1; j<=row; j++){
				System.out.print(num-- + " ");
			}
			System.out.println();
		}
	}
}

