import java.io.*;
class P2{
	public static void main(String s[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num =Integer.parseInt(br.readLine());
		for(int i=1; i<=num; i++){
			System.out.print(i+ " ");
		}
	}
}
