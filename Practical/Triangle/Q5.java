import java.io.*;

class Q5{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(br.readLine());
		int num = 1;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num*j + " ");
			}
			System.out.println();
			num++;
		}
	}
}

				
