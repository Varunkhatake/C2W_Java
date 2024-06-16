import java.io.*;

class Q3{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enetr num: ");
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		int i = 1;
		int count = 0;

		while(i<=temp){
			if(temp%i==0){
				count++;
			}
			i++;
		}
		if(count>2){
			System.out.print(num+" is a composite number");
		}
		else{
			System.out.print(num+ " is not a composite number");
		}
	}
}

