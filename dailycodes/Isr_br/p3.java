import java.io.*;
class P3{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());

		for(int i=1; i<=9; i++){
			if(i%2==0){
				System.out.print(num*num + " " );
			}
			else{
				System.out.print(num + " ");
			}
			num++;
		}
	}
}
