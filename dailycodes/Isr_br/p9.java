import java.util.*;
class P9{
	public static void main(String s[]){

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i=1; i<=9; i++){
			if(i%2==1){
				System.out.print((char)num + " ");
			}
			else{
				int ch = num+32;
				System.out.print((char)ch + " ");
			}
			num++;
		}
	}
}

