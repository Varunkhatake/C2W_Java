import java.util.*;

class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        int spa = 0;
        int col = 0;
	int num=0;
        for (int i = 1; i<row *2; i++) {
            if (i <= row) {
                spa = row - i;
            } else {
                spa = i - row;
            }
            for (int sp = 1; sp <= spa; sp++) {
                System.out.print("\t");
            }
            if (i <= row) {
                col = i * 2 - 1;
		num=i;
            } else {
                col -= 2;
		num=row*2-i;
            }
	    int sum=2;
            for (int j = 1; j <= col; j++) {
		    
		    if(j<=col/2+1){
			     System.out.print(num-- + "\t");
		    }else{
		
			    System.out.print(sum++ + "\t");
		    }
	    }
            System.out.println();
            

        }

    }
}
