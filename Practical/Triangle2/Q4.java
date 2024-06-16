import java.io.*;

class Q4{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(br.readLine());

		for(int i=1; i<=row; i++){
			int num = 64 + row;
			int num1 = num + 32;

			for(int j=1; j<=i; j++){
				if(i%2==0){
					System.out.print((char)num-- + " ");
				}
				else{
					System.out.print((char)num1-- + " ");
				}
			}
			System.out.println();
		}
	}
}

