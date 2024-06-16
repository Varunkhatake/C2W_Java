import java.io.*;
class C8{
        public static void main(String[] args)throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter your name:");
                String name = br.readLine();

                System.out.print("Enter socity name: ");
                String socname = br.readLine();

                System.out.print("Enter Wing: ");
                char wing = (char)br.read();

                System.out.print("Enter flatno: ");
                int flatno =Integer.parseInt( br.readLine());

               // System.out.println("name: "+name);
               // System.out.println("Enter scoity "+socname);
               // System.out.println("Enter num "+wing);
               // System.out.println("Enter num "+flatno);
        }
}
