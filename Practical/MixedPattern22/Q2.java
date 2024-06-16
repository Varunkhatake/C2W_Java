import java.util.*;

class Q2{
        public static void main(String s[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter row: ");
                int row = sc.nextInt();
		int count = 0;
                int ch = row +64;

                for(int i=1; i<=row; i++){
			int num = row+count;
                        for(int j=1; j<=row; j++){
                                System.out.print((char)ch+""+num-- + " " );
                        }
                        System.out.println();
			count++;
                }
        }
}
