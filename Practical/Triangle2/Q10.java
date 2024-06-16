import java.io.*;

class Q10{
        public static void main(String s[])throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter row: ");
                int row = Integer.parseInt(br.readLine());
		int num = 1;
		char ch = 'a';

                for(int i=1; i<=row; i++){

                        for(int j=1; j<=i; j++){

                                if(i%2==0){
					System.out.print(ch + " ");
				}
				else{
					System.out.print(num + " ");
				}
				ch++;
				num++;
			}
			System.out.println();
		}
	}
}

