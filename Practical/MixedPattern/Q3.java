import java.util.*;

class Q3{
        public static void main(String s[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter row: ");
                int row = sc.nextInt();

                for(int i=1; i<=row; i++){
			int ch = row+64;
			int num = 1;
                        for(int j=1; j<=row; j++){
                                
				if(i%2==0){
					System.out.print(num++ + " ");
				}
				else{
					System.out.print((char)ch-- +" ");
				}

                        }
                        System.out.println();
                }
        }
}
