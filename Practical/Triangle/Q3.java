import java.io.*;

class P3{
        public static void main(String s[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row: ");
                int row = Integer.parseInt(br.readLine());

		int count = 0;
		char ch = 'A';

                for(int i=1; i<=row; i++){
                        int ch1 =ch + count;

                        
                        for(int j=1; j<=i; j++){
                                System.out.print((char)ch1 + " ");
				ch1++;
                        }
                        System.out.println();
			count++;



                }
        }
}
