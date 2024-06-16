import java.io.*;

class Q4{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());
		int sum = 0;

		int arr[] = new int[size];

		for(int i=0; i<size; i++){
			System.out.println("Enter element");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Element are: ");

		for(int j=0; j<size; j++){
			System.out.print(arr[j]+ " " );
		}

		for(int i=0; i<size; i++){
			if(arr[i]%2==1){
				sum = sum + arr[i];
			}
		}
		System.out.println("sum of odd element : "+sum);
	}
}


