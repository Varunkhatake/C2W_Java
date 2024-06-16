import java.util.*;
class C7{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("size of an arry:"+arr.length);

        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}