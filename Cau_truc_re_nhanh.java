public class Cau_truc_re_nhanh {
    public static void main(String[] args) {
        int n = 20;
        if(n > 10){
            System.out.println("HIII");
            System.out.println("HA");
        }
        else System.out.println("tu");

        //Switch case :
        n = 4;
        switch(n){
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Ciao");
                break;
            case 4:
                System.out.println("Xin chao");
                break;  
            default:
                System.out.println("Error");
        }

        //Char:
        char digit = 'A';
        System.out.println(digit);
        System.out.println((int)digit);
        
    }
}
