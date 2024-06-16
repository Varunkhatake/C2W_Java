import java.io.*;
class P1{
	public static void main(String s[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num: ");
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(num++ + " " );
			}
			System.out.println();
		}
	}
}
