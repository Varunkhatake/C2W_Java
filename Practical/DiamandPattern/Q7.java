import java.util.*;

class Q7{
        public static void main(String[] args){
                Scanner sc= new Scanner(System.in);
                int row=sc.nextInt();
                int col=0;
                int spa=0;
                int num=0;
                for(int i=1;i<row*2;i++){
                        if(i<=row){
                                spa=row-i;
                        }else{
                                spa=i-row;
                        }
                        for(int sp=1;sp<=spa;sp++){
                                System.out.print("\t");
                        }
                        if(i<=row){
                                col=i*2-1;
                        }else{
                                col-=2;
                        }
                        for(int j=1;j<=col;j++){
                                if( j <= (col/2)+1){
                                        System.out.print((char)(j+64) +"\t");
                                }else{

                                        System.out.print((char)(col-j+1+64) +"\t");
                                }
                        }
                        System.out.println();
                }
        
	}
}
