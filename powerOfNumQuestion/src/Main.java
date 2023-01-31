import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Sınır değer\t:");
        int Boundary = keyboard.nextInt();


        int pow4=1;
        int pow5=1;
        System.out.println("************ Power of 4 ************");
        for(int i=0;i<4;i++){

            System.out.println("\t\t"+"4^"+i+"\t="+pow4);
            pow4 = 4* pow4;
            if(pow4>=Boundary){
                break;
            }
        }
        System.out.println("************ Power of 5 ************");
        for(int i=0;i<5;i++){
            System.out.println("\t\t"+"5^"+i+"\t="+pow5);
            pow5 = 5* pow5;

            if(pow5>=Boundary){
                break;
            }

        }




    }


}