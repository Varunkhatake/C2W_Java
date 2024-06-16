import java.io.*;

class Q9{
        public static void main(String s[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("enter row: ");
                int row = Integer.parseInt(br.readLine());

                for(int i=1; i<=row; i++){
			int ch = 64 + row;
                        for(int j=row; j>=i; j--){
                                System.out.print((char)ch-- + " ");
                        }
                        System.out.println();
                        
                }
        }
}
