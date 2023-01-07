import java.util.Scanner;

public class advancedCalculator {

    static void obeb(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scn.nextInt();

        System.out.print("Enter the second number: ");
        int b = scn.nextInt();

        int n1 = a, n2 = b, obeb = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                obeb = i;
        }
        System.out.println("OBEB: " + obeb);
    }

    static void okek(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scn.nextInt();

        System.out.print("Enter the second number: ");
        int b = scn.nextInt();
        int okek = 0, max = a * b;

        for(int i = max; i > 0; i--) {
            if(i % a == 0 && i % b == 0) {
                okek = i;
            }
        }
        System.out.println("OKEK: " + okek);

    }

    static void asal(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scn.nextInt();

        for(int i = 2; i< a; i++) {
            while(a % i == 0) {
                System.out.println(i+" ");
                a = a / i;
            }
        }
        if(a >2) {
            System.out.println(a);
        }
    }


    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int select;

        String menu = "1- OBEB\n"
                + "2- EKOK\n"
                + "3- Asal\n"
                + "4- Exit\n";

        do{
            System.out.println(menu);
            System.out.print("Choose an operation: ");
            select = scn.nextInt();

            switch(select){
                case 1:
                    obeb();
                    break;
                case 2:
                    okek();
                    break;
                case 3:
                    asal();
                    break;
                case 4:
                    break;
            }

        }while(select != 4);

    }
}
