import java.util.*;
class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers of  row: ");
		int row= sc.nextInt();
		System.out.print("Enter numbers of  colomn: ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		System.out.println("Enter elements: ");

		for (int i=0;i < arr.length;i++){

			for(int j=0;j < arr[i].length;j++){

				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		for (int i=0;i < arr.length;i++){

                        for(int j=0;j<arr[i].length;j++){

                                System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

		
