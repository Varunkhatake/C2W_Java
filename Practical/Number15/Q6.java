import java.io.*;

class Q6{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num: ");
		int num = Integer.parseInt(br.readLine());
		int var = 0;
		int rem = 0;
		int temp = num;

		while(num>0){
			rem = num%10;
			var = var*10+rem;
			num/=10;
		}
		if(temp==var){
			System.out.print(temp+ " is a palindrome number");
		}
		else{
			System.out.print(temp+" is not a palindrome number");
		}
	}
}

