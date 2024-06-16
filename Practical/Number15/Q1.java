import java.io.*;

class Q1{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Num: ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int i = 1;
		System.out.print("Factors of "+num+" are ");


		while(i<=temp){
			if(temp%i==0){
				System.out.print(i + " ");
			}
			i++;
		}
	}
}

