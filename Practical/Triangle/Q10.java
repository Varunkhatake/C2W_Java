import java.io.*;

class Q10{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter row: ");
		int row = Integer.parseInt(br.readLine());

		int count = 0;

		for(int i=1; i<=row; i++){
			int num = 65;
			num = num+count;


			for(int j=row; j>=i; j--){

				if(i%2==0){
					if(j%2==1){
						System.out.print(num + " ");
					}
					else{
						System.out.print((char)num + " ");
					}
				}
				else{
					if(j%2==0){
						System.out.print(num + " ");
					}
					else{
						System.out.print((char)num + " ");
					}
				}
				num++;
			}
			System.out.println();
			count++;
		}
	}
}


