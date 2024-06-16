import java.util.*;
class Q8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int spa = 0;
       		int num=64;                                                                                                                                     	    int col=0;	
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
				num+=i;
            		 }else {      
				col -= 2;   
				num+= row*2-i;
           		 }      
			int sum=66;
			for (int j = 1; j <= col; j++) {
                    		if(j<=col/2+1){
                             		System.out.print((char)num-- + "\t");
                    		}else{                       
					System.out.print((char)sum++ + "\t");
                    		}  
			}
			System.out.println();
		 }
	}
}
