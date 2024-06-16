import java.io.*;

class Q8{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter row: ");
		int row = Integer.parseInt(br.readLine());
		
		int count = 0;

		for(int i=1; i<=row; i++){
			int num = 1;
			int num1=num+count;
			for(int j=row; j>=i; j--){
				System.out.print(num1++ + " ");
			}
			System.out.println();
			count++;
		}
	}
}

