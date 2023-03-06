import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the number\t:");
        int number = keyboard.nextInt();


        int count=0;

        for (int i=1;i<number;i++){

            if(number%i==0){
                count+=i;
            }

        }

        if(count==number){
            System.out.println("Girdiginiz sayi mukemmel sayidir.");
        }else
            System.out.println("Girdiginiz sayi mukemmel sayi degil.");


    }
}