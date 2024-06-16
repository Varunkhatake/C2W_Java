import java.util.*;
class P1{
	public static void main(String s[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(num++ + " " );
			}
			System.out.println();
		}
	}
}
