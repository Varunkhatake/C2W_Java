import java.io.*;

class Q8{
	public static void main(String s[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter size : ");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){
			System.out.print("Enter employee's age");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Employee's age are: ");

		for(int j=0; j<arr.length; j++){
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		System.out.println("count of employee's are : "+arr.length);
	}
}


