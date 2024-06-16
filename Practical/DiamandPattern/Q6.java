import java.util.*;
class Q6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter row:");
                int row=sc.nextInt();
                int col=0;
                int spa=0;
                int num=0;
                for(int i=1;i<row*2;i++){
                        if(i<=row){
                                spa=row-i;
                                col=i*2-1;
                                num=i;
                        }else{
                                spa=i-row;
                                col-=2;
				num-=1;
                        }
                        for(int sp=1;sp<=spa;sp++){
                                System.out.print("\t");
                        }
                        for(int j=1;j<=col;j++){
                                if(i<=row){
                                        System.out.print(num+"\t");
                                }else{
                                         System.out.print(num +"\t");
                                }

                        }
                        System.out.println();
                }
        }
}
