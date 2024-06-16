class C15{
        public static void main(String[] ar){
                char num = 'B';
                System.out.println("before switch");
                switch(num){
                        case 'A':
                                System.out.println("A");
                                break;
                        case 'B':
                                System.out.println("B");
                                break;
                        case 'C':
                                System.out.println("C");
                                break;
                        default:
                                System.out.println("default");

                        }
                System.out.println("after switch");
        }
}
