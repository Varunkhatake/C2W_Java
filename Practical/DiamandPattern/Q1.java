import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        int spa = 0;
        int col = 0;
        for (int i = 1; i<(row*2); i++) {
            if (i <= row) {
                spa = (row - i);
            } else {
                spa = (i - row);
            }
            for (int sp = 1; sp <= spa; sp++) {
                System.out.print("\t");
            }
            if (i <= row) {
                col = (i * 2) - 1;
            } else {
                col -= 2;
            }
            for (int j = 2; j <= col; j++) {
                System.out.print("#" + "\t");
            }
            System.out.println();

        }

    }
}
