import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);


        int number;
        int result =0;

        do {

            System.out.print("Sayı giriniz\t:");

            number= keyboard.nextInt();

            if(number%4==0){
                result = result +number;
            }

        }while (isOdd(number)==false);




        System.out.println(result);


    }



    static boolean isOdd(int number){

        if(number%2==1){
            return true;
        }else
            return false;

    }

}