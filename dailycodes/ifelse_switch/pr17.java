class C17{
        public static void main(String[] ar){
                char num = 'A';
                System.out.println("before switch");
                switch(num){
                        case 'A':
                                System.out.println("A");
                                break;
                        case 65:
                                System.out.println("A");
                                break;
                        case 'B':
                                System.out.println("B");
                                break;
			case 66:
				System.out.println("B");
                        default:
                                System.out.println("default");

                        }
                System.out.println("after switch");
        }
}
