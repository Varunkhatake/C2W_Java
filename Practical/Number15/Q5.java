import java.io.*;

class Q5{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter num: ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int rem = 0;
		int var = 0;
		
		while(num>0){
			rem = num%10;
			var = var*10+rem;
			num/=10;
		}
		System.out.print("Reverse of "+temp +" is "+var);
	}
}




