import java.util.Scanner;

class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        int num = (row*row+2)/2;
	int ch = 65+num;

        for (int i = 1; i <= row; i++) {
   
            for (int j = row; j >=i; j--) {
                System.out.print((char)ch++ + " ");
                
            }
            System.out.println();
            
	}
    }
}

