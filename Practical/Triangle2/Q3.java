import java.io.*;

class Q3{
        public static void main(String s[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row: ");
                int row = Integer.parseInt(br.readLine());

                for(int i=1; i<=row; i++){
			int num = 64+row;

                        for(int j=1; j<=i; j++){

                                System.out.print((char)num-- + " ");
			}
			System.out.println();
		}
	}
}

