import java.io.*;

class Q4{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num: ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int fact = 1;
		int i = 1;

		while(i<=temp){
			fact = fact*num;
			num--;
			i++;
		}
		System.out.print("Factorial of"+temp+" is "+ fact);
	}
}

